class Solution {
    public int shortestPathAllKeys(String[] grid) {
        int m = grid.length;
        int n = grid[0].length();
        int startX = -1, startY = -1;
        int totalKeys = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c = grid[i].charAt(j);
                if (c == '@') {
                    startX = i;
                    startY = j;
                } else if (c >= 'a' && c <= 'f') {
                    totalKeys++;
                }
            }
        }

        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();
        Queue<String> qk = new LinkedList<>();

        Set<String> visited = new HashSet<>();

        String startKeys = "0".repeat(totalKeys);
        String targetKeys = "1".repeat(totalKeys);

        qx.add(startX);
        qy.add(startY);
        qk.add(startKeys);
        visited.add(startX + " " + startY + " " + startKeys);

        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int steps = 0;

        while (!qx.isEmpty()) {
            int size = qx.size();
            while (size-- > 0) {
                int r = qx.remove();
                int c = qy.remove();
                String keys = qk.remove();

                if (keys.equals(targetKeys)) {
                    return steps;
                }

                for (int[] dir : dirs) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if (nr < 0 || nr >= m || nc < 0 || nc >= n) continue;
                    char cell = grid[nr].charAt(nc);
                    if (cell == '#') continue;

                    // Lock check
                    if (cell >= 'A' && cell <= 'F') {
                        int lockIndex = cell - 'A';
                        if (lockIndex >= totalKeys || keys.charAt(lockIndex) == '0') {
                            continue;
                        }
                    }

                    // Key pickup check
                    String nextKeys = keys;
                    if (cell >= 'a' && cell <= 'f') {
                        int keyIndex = cell - 'a';
                        if (keyIndex < totalKeys) {
                            char[] kArr = keys.toCharArray();
                            kArr[keyIndex] = '1';
                            nextKeys = String.valueOf(kArr);
                        }
                    }

                    String state = nr + " " + nc + " " + nextKeys;
                    if (!visited.contains(state)) {
                        visited.add(state);
                        qx.add(nr);
                        qy.add(nc);
                        qk.add(nextKeys);
                    }
                }
            }
            steps++;
        }

        return -1;
    }
}

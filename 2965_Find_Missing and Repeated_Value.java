class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m=grid.length*grid[0].length;
         ArrayList<Integer> l=new ArrayList<>();
        int[] f=new int[m+1];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                f[grid[i][j]]++;
                if(f[grid[i][j]]>1){
                    l.add(grid[i][j]);
                }
            }
        }
        for(int i=1;i<f.length;i++){
            if(f[i]==0){
                l.add(i);
            }
        }
        int h=0;
        int[] res=new int[l.size()];
        for(int c:l){
            res[h]=c;
            h++;

        }
        return res;
    }
}

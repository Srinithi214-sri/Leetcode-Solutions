class Solution {
    public String frequencySort(String s) {
         HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));
        String res="";
        for(char c:list){
            int f=map.get(c);
            for(int i=0;i<f;i++){
                res+=c;
            }
        }
        return res;
    }
}

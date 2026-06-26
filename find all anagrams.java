class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> l=new ArrayList<>();
        if(s.length()<p.length()) return l;
        int left=0;
        int max=0;
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<p.length();i++) {
            char c=p.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);

        }
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int right=0;right<s.length();right++) {
           map2.put(s.charAt(right),map2.getOrDefault(s.charAt(right),0)+1);
           if(right==left+p.length()-1) {
                if(map1.equals(map2)) {
                    l.add(left);
                }
                if(map2.get(s.charAt(left))==1) {
                    map2.remove(s.charAt(left));
                }
                else {
                    map2.put(s.charAt(left),map2.get(s.charAt(left))-1);
                }
               
                left++;
           }
        }
      return l;
    }
}

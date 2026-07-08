class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<t.length();i++){
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
            
        }
        int min=1000000;
        int l=0;
        int r=0;
        int start=0;
        int m=0;
        while(r<s.length()) {
            if(map1.containsKey(s.charAt(r))) {
                map2.put(s.charAt(r),map2.getOrDefault(s.charAt(r),0)+1);
                if(map2.get(s.charAt(r)).equals(map1.get(s.charAt(r)))) {
                    m++;
                }
            }
            while(m==map1.size()) {
                if (r - l + 1 < min) {
                    min = r - l + 1;
                    start = l;
                }

                char leftChar = s.charAt(l);
                if (map1.containsKey(leftChar)) {
                    if (map2.get(leftChar).equals(map1.get(leftChar))) {
                        m--;
                    }
                    map2.put(leftChar, map2.get(leftChar) - 1);
                }
                l++;
            }
            r++;
        }
         return min==1000000?"":s.substring(start,start+min);
    }
}

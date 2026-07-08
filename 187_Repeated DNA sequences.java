class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        ArrayList<String> l=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<=s.length()-10;i++) {
            String str=s.substring(i,10+i);        
             map.put(str,map.getOrDefault(str,0)+1);             
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()) {
            if(entry.getValue()>1) {
                l.add(entry.getKey());
            }
        }
        return l;
    }
}

class Solution {
    public List<String> printVertically(String s) {
        int max=-1;
        String[] str=s.split(" ");
        for(String x:str){
            max=Math.max(max,x.length());
        }
        ArrayList<String> l=new ArrayList<>();
        for(int i=0;i<max;i++){
            String res="";
            for(int j=0;j<str.length;j++){
                String g=str[j];
                if(i>=g.length()){
                    res+=" ";
                }
                else{
                  res+=g.charAt(i);
                }
            }
            l.add(res.replaceAll("\\s+$", ""));
        }
        return l;
    }
}

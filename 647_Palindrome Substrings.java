class Solution {
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++) {
            String res="";
            for(int j=i;j<s.length();j++) {
                res+=s.charAt(j);
                String r=new StringBuilder(res).reverse().toString();
                if(res.equals(r)) {                   
                    c++;
                }
            }
        }
        return c;
    }
}

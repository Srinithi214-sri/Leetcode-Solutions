class Solution {
    public String reverseWords(String s) {
        // String ss=s.trim().split("\\s+");
        String[] w=s.trim().split("\\s+");
        String res="";
        for(int i=w.length-1;i>=0;i--) {
            res+=w[i]+" ";
        }
        return res.trim();
    }
}

class Solution {
    public String firstPalindrome(String[] words) {
         String res="";
        for(int i=0;i<words.length;i++) {
           
            String ss=new StringBuilder(words[i]).reverse().toString();
            if(words[i].equals(ss)) {
                return ss;
            }

        }
        return res;
    }
}

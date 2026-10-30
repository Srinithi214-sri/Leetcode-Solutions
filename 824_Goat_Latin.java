class Solution {
    public String toGoatLatin(String sentence) {
        String[] str=sentence.split(" ");
        String res="";
        for(int i=0;i<str.length;i++) {
            String s=str[i];
            if(s.charAt(0)=='A' || s.charAt(0)=='E'||s.charAt(0)=='I'||s.charAt(0)=='O'||s.charAt(0)=='U' ||s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u') {
                res+=s+""+"ma";
                for(int j=0;j<=i;j++){
                    res+="a";
                }
            }
            else{
                for(int j=1;j<s.length();j++){
                    res+=s.charAt(j);
                }
                res+=s.charAt(0)+""+"ma";
                for(int j=0;j<=i;j++){
                    res+="a";
                }
            }
            if(i<str.length-1){
            res+=" ";
            }
        }
        return res;
        
    }
}

class Solution {
    public static boolean isvowel(char c) {
        if(c=='A' || c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
            return true;
        }
        else {
            return false;
        }
    }
    public int maxVowels(String s, int k) {
        int c=0;
       int ans=0;
      
        for(int i=0;i<k;i++) {
           boolean res=isvowel(s.charAt(i));
           if(res==true) 
            c++;
            
        }
        ans=c;
        for(int right=k;right<s.length();right++) {
            
           if(isvowel(s.charAt(right-k))) {
            c--;
           }
           if(isvowel(s.charAt(right))) {
            c++;
           }
           ans=Math.max(ans,c);
           if(ans==k) {
            return k;
           }
        }
        return ans;
    }
}

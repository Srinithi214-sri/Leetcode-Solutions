class Solution {
    public boolean checkInclusion(String s1, String s2) {
        boolean f=false;
        int[] a1=new int[26];
        for(int i=0;i<s1.length();i++) {
            char c=s1.charAt(i);
            int m=(c-'a');
           a1[m]++;
        }
        int[] a2=new int[26];
        for(int i=0;i<=s2.length()-s1.length();i++) {
            for(int j=i;j<s1.length()+i;j++) {
                char c=s2.charAt(j);
                int m=(c-'a');
                a2[m]++;
            
            }
            if(Arrays.equals(a1,a2)) {
                    f=true;
                    return f;
                }          
                for(int k=0;k<a2.length;k++) {
                    a2[k]=0;              
                }
        }
        return f;
    }
}

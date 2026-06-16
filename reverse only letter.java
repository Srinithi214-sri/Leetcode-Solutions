class Solution {
    public String reverseOnlyLetters(String s) {
        char[] c=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j) {
            if(!(c[i]>='a' && c[i]<='z' || c[i]>='A' && c[i]<='Z')) {
                    i++;
            }       
            else if(!(c[j]>='a' && c[j]<='z' || c[j]>='A' && c[j]<='Z')) {
            j--;
            }
            else {
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
                i++;
                j--;

            }
        } 
        return new String(c);
    }
}

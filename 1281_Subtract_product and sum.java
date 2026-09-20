class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;
        int s=0;
        String number=String.valueOf(n);
       for(int i=0;i<number.length();i++){
         p*=number.charAt(i)-'0';
         s+=number.charAt(i)-'0';
       }
       return p-s;
    }
}

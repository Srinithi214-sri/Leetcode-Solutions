class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] a=new int[s.length()];
        int m=0;
       for(int i=0;i<s.length();i++) {
          if(s.charAt(i)==c) {
           a[m]=i;
           m++;
        }
       }
       
       ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<s.length();i++) {
       int min=Integer.MAX_VALUE;
        for(int l=0;l<m;l++) {
            
           int h = Math.abs(a[l] - i);
           min=Math.min(min,h);
        }    
        list.add(min);
        
    }
    int i=0;
    int[] b=new int[s.length()];
    for(int x:list) {
        b[i++]=x;
    }
    return b;
    }
}

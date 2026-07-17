class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(x,y)->Integer.compare(x[0],y[0]));
       int st=intervals[0][0];
       int en=intervals[0][1];       
       ArrayList<Integer> l=new ArrayList<>();
       for(int i=1;i<intervals.length;i++) {
           if(intervals[i][0]<=en) {
            en=Math.max(intervals[i][1],en);
           }
           else {
                l.add(st);
                l.add(en);
                st=intervals[i][0];
                en=intervals[i][1];
           }
       }
       l.add(st);
       l.add(en);
       String[] str=new String[l.size()];
       int h=0;
       for(int x:l) {
        str[h++]=String.valueOf(x);
       }
       int h2=0;
       int[][] a=new int[str.length/2][2];
       for(int i=0;i<str.length/2;i++) {       
            a[i][0]=Integer.parseInt(str[h2++]);
            a[i][1]=Integer.parseInt(str[h2++]);       
       }
       return a;
    }
}

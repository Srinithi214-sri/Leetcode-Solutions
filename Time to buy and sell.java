class Solution {
    public int maxProfit(int[] a) {
          int min=a[0];
          int profit=0;
          for(int i=1;i<a.length;i++) {
            if(a[i]<min) {
                min=a[i];
            }
            else if(a[i]-min>profit) {
                profit=a[i]-min;
            }
          }
          return profit;
    }

}

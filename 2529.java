class Solution {
    public int maximumCount(int[] nums) {
        int p=0;
        int n=0;
        for(int i=0;i<nums.length;i++) {
           if(nums[i]!=0) {
              if(nums[i]>0) {
                 p++;
              }
              else {
                n++;
              }
           }
        }
        int s=0;
        if(p>=n) {
            s=p;
        }
        else {
            s=n;
        }
        return s;
    }
}
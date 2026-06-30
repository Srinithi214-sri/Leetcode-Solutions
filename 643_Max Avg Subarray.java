class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        double max=-Double.MAX_VALUE;
        double sum=0;
        for(int r=0;r<nums.length;r++) {
            sum+=nums[r];
            if(r==l+k-1) {
                max=Math.max(max,sum);
                sum-=nums[l];
                l++;
            }
            
        }
        return max/k;
    }
}

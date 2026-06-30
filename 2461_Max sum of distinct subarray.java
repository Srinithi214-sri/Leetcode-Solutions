class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> s=new HashSet<>();
       int l=0;
       long sum=0;
       long max=0;
       for(int right=0;right<nums.length;right++) {
            while(s.contains(nums[right])||s.size()==k) {
                s.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            sum+=nums[right];
        s.add(nums[right]);
            if(s.size()==k) {
                max=Math.max(max,sum);
            }
       }
       return max;
    }
}

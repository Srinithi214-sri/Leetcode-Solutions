class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums.length==1) {
            return nums[0];
        }
        int max=0;
        for(int num:nums) {
            max=Math.max(max,num);
        }
        int[] dp=new int[max+1];
        int[] num=new int[max+1];
        for(int n:nums) {
            num[n]+=n;
        }
        dp[0]=num[0];
        dp[1]=Math.max(num[0],num[1]);
        for(int i=2;i<=max;i++) {
            dp[i]=Math.max(dp[i-1],num[i]+dp[i-2]);
        }
        return dp[max];
    }
}

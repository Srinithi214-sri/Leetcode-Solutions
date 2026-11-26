class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]!=0) { return 0;}
        int mis=0;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]+1!=nums[i+1]) {
                mis=i+1;
                return mis;
            }
        }
        
        return nums[nums.length-1]+1;
    }
}

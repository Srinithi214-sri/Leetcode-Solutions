class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1) { return; }
        int n=0; 
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
                nums[n]=nums[i];
                n++;
            }
        }
        while(n<nums.length) {
            nums[n]=0;
            n++;
        }
    }
}

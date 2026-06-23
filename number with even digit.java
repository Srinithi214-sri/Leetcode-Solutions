class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++) {
           int m=nums[i];
           int v=String.valueOf(m).length();
            if(v%2==0) {
                c++;
            }
        }
        return c;
    }
}
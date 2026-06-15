class Solution {
    public int search(int[] nums, int t) {
        
        int i=0;
        int j=nums.length-1;
        while(i<=j) {
            int mid=(i+j)/2;
        if(t==nums[mid]) {
            return mid;
        }
        else if(t>nums[mid]) {
            i=mid+1;
        }
        else {
            j=mid-1;
        }
    }
        return -1;
    }
}

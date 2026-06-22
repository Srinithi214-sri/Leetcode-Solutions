class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int t=0;
        for(int i=m;i<nums1.length;i++) {
            nums1[i]=nums2[t];

            t++;
        }
       
        Arrays.sort(nums1);
    }
}

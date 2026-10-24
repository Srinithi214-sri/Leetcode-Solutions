class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] l=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int h=nums1[i];
            int index=0;
            for(int x=0;x<nums2.length;x++){
                if(h==nums2[x]){
                    index=x;
                    break;
                }
            }
            int next=-1;
            for(int j=index+1;j<nums2.length;j++){
            //    int k=nums2[j];
                if(nums2[j]>h){
                    next=nums2[j];
                    break;
                }
                
            }
            l[i]=next;
        }
        return l;
    }
}

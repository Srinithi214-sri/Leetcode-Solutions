class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();
    for( int num:nums1) {
        s1.add(num);
    }
    for(int num:nums2) {
        s2.add(num);
    }
    s1.retainAll(s2);
    int[] res=new int[s1.size()];
    int i=0;
    for(int n:s1) {
        res[i++]=n;
    }
    return res;
     }
    
}
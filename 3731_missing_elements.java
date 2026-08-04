class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int[] f=new int[500];
        ArrayList<Integer> l=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<nums.length;i++) {
            f[nums[i]]=1;
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        for(int i=min;i<=max;i++) {
            if(f[i]!=1) {
                l.add(i);
            }
        }
        return l;
    }
}

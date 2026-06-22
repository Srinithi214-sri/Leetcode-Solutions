class Solution {
    public void rotate(int[] nums, int k) {
       ArrayList<Integer> list=new ArrayList<>();
       for(int num:nums) {
         list.add(num);
       }
       Collections.rotate(list,k);
       int i=0;
       for(int n:list) {
          nums[i++]=n;
       }
    }
}

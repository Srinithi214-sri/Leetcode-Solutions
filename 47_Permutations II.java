class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>> res=new ArrayList<>();
        solve(nums,0,nums.length-1,res);    
        return res;
    }
    private void solve(int[] nums,int l,int r,List<List<Integer>> res) {
        if(l==r) {
          List<Integer> cur=new ArrayList<>();
          for(int num:nums) {
            cur.add(num);
            
          }
          if(!res.contains(cur)) {
          res.add(cur);
          }
          return;
        }
        for(int i=l;i<=r;i++) {
            swap(nums,l,i);
            solve(nums,l+1,r,res);
            swap(nums,l,i);
        }

    }
    private void swap(int[] nums,int i,int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

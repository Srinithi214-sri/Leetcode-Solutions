class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        solve(nums,0,res,sub);
        return res;
    }
    void solve(int[] nums,int ind,List<List<Integer>> res,List<Integer> sub) {
        if(ind==nums.length) {
            res.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[ind]);
        solve(nums,ind+1,res,sub);

        sub.remove(sub.size()-1);
        solve(nums,ind+1,res,sub);
    }
}

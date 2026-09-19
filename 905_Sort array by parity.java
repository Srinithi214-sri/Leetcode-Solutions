class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
         ArrayList<Integer> a2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                a.add(nums[i]);
            }
            else {
                a2.add(nums[i]);
            }
        }
        int[] t=new int[nums.length];
        int h=0;
        for(int x:a){
            t[h]=x;
            h++;
        }
        for(int x:a2){
            t[h]=x;
            h++;
        }
        return t;
       
    }
}

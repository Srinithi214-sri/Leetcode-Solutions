class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                a.add(nums[i]);
            }
            else {
                b.add(nums[i]);
            }
        }
        int[] arr=new int[nums.length];
        int h1=0;
        int h2=1;
        for(int x:a){
            arr[h1]=x;
            h1+=2;
        }
        for(int x:b){
            arr[h2]=x;
            h2+=2;
        }
        return arr;
    }
}

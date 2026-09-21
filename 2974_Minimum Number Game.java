class Solution {
    public int[] numberGame(int[] num) {
            Arrays.sort(num);
            int[] arr=new int[num.length];
            arr[1]=num[0];
            for(int i=1;i<num.length;i++){
                if(i%2!=0){
                    arr[i-1]=num[i];
                }
                else {
                    arr[i+1]=num[i];
                }
            }
            return arr;
    }
}

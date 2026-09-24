class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length==1){
            arr[0]=-1;
            return arr;
        }
        for(int i=0;i<arr.length-1;i++){
            int m=0;
            for(int j=i+1;j<arr.length;j++){
                m=Math.max(m,arr[j]);
            }
            arr[i]=m;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}

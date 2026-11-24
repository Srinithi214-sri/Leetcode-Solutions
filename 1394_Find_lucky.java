class Solution {
    public int findLucky(int[] arr) {
        if(arr[0]==500) return 500;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int num:arr){
        map.put(num,map.getOrDefault(num,0)+1);
       }
       int max=0;
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        if(entry.getKey()==entry.getValue()){
            max=Math.max(max,entry.getKey());
        }
       }

       return max>0?max:-1;
    }
}

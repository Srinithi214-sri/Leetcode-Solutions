class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] a=new int[2];
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int h=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                a[h]=entry.getKey();
                h++;
            }
        }
        return a;
    }
}

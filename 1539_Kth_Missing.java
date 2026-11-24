class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        for(int num:arr){
            l.add(num);
        }
       int i=1;
       while(l2.size()<k){
        if(!l.contains(i)){
            l2.add(i);
        }
        i++;
       }
        return l2.get(k-1);
    }
}

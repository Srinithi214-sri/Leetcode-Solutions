class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(add(i)){
                l.add(i);
            }
        }
        return l;
    }
    static boolean add(int n){
        int temp=n;
        while(temp>0){
            int d=temp%10;
            if(d==0||n%d!=0){
                return false;
            }
            temp/=10;
        }
        return true;
    }
}

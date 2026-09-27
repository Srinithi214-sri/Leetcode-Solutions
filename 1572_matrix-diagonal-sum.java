class Solution {
    public int diagonalSum(int[][] mat) {
        int p=0;
        int s=0;
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j){
                    p+=mat[i][j];
                    l.add(mat[i][j]);
                }
            }
        }
        int h=0;
        for(int i=mat.length-1;i>=0;i--){     
            s+=mat[h][i];     
            h++;
        }
        int kk=0;
        int ans=0;
        if(mat.length%2==1){
            kk=mat.length/2;
            ans=mat[kk][kk];
            return (s+p)-ans;
        }
        
        System.out.print(s+" "+p);
        return p+s;
    }
}

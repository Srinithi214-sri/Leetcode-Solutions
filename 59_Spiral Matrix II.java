class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat=new int[n][n];
        if(n==0) {
            return mat;
        }
        int top=0;
        int b=n-1;
        int l=0;
        int r=n-1;
        int num=1;
        while(l<=r&&top<=b) {
            for(int i=l;i<=r;i++) {
                mat[top][i]=num++;
            }
            top++;
            for(int i=top;i<=b;i++) {
                mat[i][r]=num++;
            }
            r--;
            if(top<=b) {
            for(int i=r;i>=l;i--) {
                mat[b][i]=num++;
            }
            b--;
            }
            if(l<=r) {
                for(int i=b;i>=top;i--) {
                    mat[i][l]=num++;
                }
            l++;
            }
        }
        return mat;
    }
}

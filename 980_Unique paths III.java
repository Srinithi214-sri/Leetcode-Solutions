class Solution {   
    static int cc=0; 
    public int uniquePathsIII(int[][] grid) {
        cc=0;
        int s=0;
        int e=0;
         int b=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j]==1) {
                    s=i;
                    e=j;
                }
                else if(grid[i][j]!=-1) {
                    b++;
                }
            }
        }                
         int[][] sol=new int[m][n];
         solve(s,e,m,n,sol,grid,0,b); 
         return cc;
    }
     static boolean solve(int x,int y,int m,int n,int[][] sol,int[][] grid,int s,int t) {
        if(x<0 || x>=m||y<0||y>=n||sol[x][y]==1||grid[x][y]==-1) {
            return false;
        }
        if(grid[x][y]==2) {
        if(s==t) {
            cc++;
        }
            // sol[x][y]=1;
            return false;
        }
        sol[x][y]=1;
        if(solve(x+1,y,m,n,sol,grid,s+1,t)) {
            return true;
        }
        if(solve(x,y-1,m,n,sol,grid,s+1,t)){
            return true;
        }
        if(solve(x-1,y,m,n,sol,grid,s+1,t)) {
            return true;
        }
        if(solve(x,y+1,m,n,sol,grid,s+1,t)){
            return true;
        }
        sol[x][y]=0;
        return false;
    }
}

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int l=0;
        ArrayList<Integer> ll=new ArrayList<>();
        int r=matrix[0].length-1;
        int t=0;
        int b=matrix.length-1;
        while(t<=b && l<=r) {
            for(int i=l;i<=r;i++) {
                ll.add(matrix[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++) {
                ll.add(matrix[i][r]);
            }
            r--;
            if(t<=b) {
                for(int i=r;i>=l;i--) {
                    ll.add(matrix[b][i]);
                }
            }
            b--;
            if(l<=r) {
                for(int i=b;i>=t;i--) {
                    ll.add(matrix[i][l]);
                }
            }
            l++;
        }
        return ll;
    }
}

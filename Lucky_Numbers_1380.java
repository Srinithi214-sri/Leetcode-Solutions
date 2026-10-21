class Solution {
    ArrayList<Integer> l=new ArrayList<>();
    public List<Integer> luckyNumbers(int[][] matrix) {
        if(matrix.length==0||matrix[0].length==0) return l;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                search(i,j,matrix);
            }
        }
        return l;
    }
    public void search(int r,int c,int[][] matrix){
         int max=Integer.MIN_VALUE;
         int min=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
            min=Math.min(min,matrix[r][i]);
        }
        for(int j=0;j<matrix.length;j++){
            max=Math.max(max,matrix[j][c]);
        }
        if(min==max){
            l.add(min);
        }
    }
}

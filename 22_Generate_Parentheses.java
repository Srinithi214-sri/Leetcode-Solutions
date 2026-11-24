class Solution {
    
    public List<String> generateParenthesis(int n) {
     ArrayList<String> l=new ArrayList<>();
        solve(n,0,0,"",l);
        return l;
    }
    static void solve(int n,int o,int c,String res,ArrayList<String> l){
        if(res.length()==2*n){
            l.add(res);
            return;
        }
        if(o<n){
            solve(n,o+1,c,res+"(",l);
        }
        if(c<o){
            solve(n,o,c+1,res+")",l);
        }
    }
}

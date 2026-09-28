class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> st=new ArrayDeque<>();
        for(String op:operations){
            if(op.equals("C")) st.pop();
            else if(op.equals("D")) st.push(st.peek()*2);
            else if(op.equals("+")){
                int f=st.pop();
                int s=st.peek();
                st.push(f);
                st.push(f+s);
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}

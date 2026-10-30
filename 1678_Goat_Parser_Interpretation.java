class Solution {
    public String interpret(String command) {
        String res="";
        for(int i=0;i<command.length()-1;i++){
            if(command.charAt(i)=='('&&command.charAt(i+1)==')'){
                res+="o";
            }
            else if(command.charAt(i)!='('&&command.charAt(i)!=')'){
                res+=command.charAt(i);
            }
        }
        if((command.charAt(command.length()-1)!='(') && (command.charAt(command.length()-1)!=')')){
            res+=command.charAt(command.length()-1);
        }
        return res;
    }
}

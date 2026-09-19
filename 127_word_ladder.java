class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int m=1;
        Set<String> set=new HashSet<>(wordList);
        Queue<String> que=new LinkedList<>();
        if(!set.contains(endWord)){
            return 0;
        }
        que.add(beginWord);
        // set.remove(beginWord);
        while(!que.isEmpty()){
            int n=que.size();
            while(n-->0){
                String g=que.remove();
                if(g.equals(endWord)){ 
                    return m;
                }
                char[] ch=g.toCharArray();
                for(int i=0;i<ch.length;i++){
                    char org=ch[i];
                    for(char c='a';c<='z';c++){
                        ch[i]=c;
                        String nex=new String(ch);
                        if(set.contains(nex)){
                            set.remove(nex);
                            que.add(nex);
                        }
                    }
                    ch[i]=org;
                }
            }
            m++;
        }
        return 0;
    }
}

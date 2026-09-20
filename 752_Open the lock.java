class Solution {
    public int openLock(String[] deadends, String target) {
        HashSet<String> dead=new HashSet<>();
        for(String x:deadends){
            dead.add(x);
            if(dead.contains("0000")) return -1;
        }
        if(dead.contains(target)){
            return -1;
        }
        Queue<String> q=new LinkedList<>();
        HashSet<String> vis=new HashSet<>();
        q.add("0000");
        vis.add("0000");
        int m=0;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                String g=q.remove();
                if(g.equals(target)){
                    // System.out.print(m);
                    return m;
                }
                for(int i=0;i<4;i++){
                    char[] a=g.toCharArray();
                    if(a[i]=='9') a[i]='0';
                    else a[i]++;
                    String nex=new String(a);
                    if(!vis.contains(nex)&&!dead.contains(nex)) {
                        vis.add(nex);
                        q.add(nex);
                    }
                    a=g.toCharArray();
                    if(a[i]=='0') a[i]='9';
                    else a[i]--;
                    nex=new String(a);
                     if(!vis.contains(nex)&&!dead.contains(nex)) {
                        vis.add(nex);
                        q.add(nex);
                    }
                }
            }
            m++;
        }
        return -1;
    }
}

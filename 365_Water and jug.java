class Solution {
    public boolean canMeasureWater(int x, int y, int T) {
        if(T>x+y) return false;
        Queue<Integer> qr=new LinkedList<>();
        Queue<Integer> qc=new LinkedList<>();
        qr.add(0);
        qc.add(0);
        HashSet<String> vis=new HashSet<>();
        vis.add("0,0");
        while(!qr.isEmpty()){
            int a=qr.remove();
            int b=qc.remove();
            if(a+b==T) {
                // System.out.print("true");
                return true;
            }
            int na=x;
            int nb=b;
            String  h=na+","+nb;
            if(!vis.contains(h)){
                vis.add(h);
                qr.add(na);
                qc.add(nb);
            }
            na=a;
            nb=y;
            h=na+","+nb;
            if(!vis.contains(h)){
                vis.add(h);
                qr.add(na);
                qc.add(nb);
            }
            na=0;
            nb=b;
            h=na+","+nb;
            if(!vis.contains(h)){
                vis.add(h);
                qr.add(na);
                qc.add(nb);
            }
            na=a;
            nb=0;
            h=na+","+nb;
            if(!vis.contains(h)){
                vis.add(h);
                qr.add(na);
                qc.add(nb);
            }
            int x2=Math.min(a,y-b);
            na=a-x2;
            nb=b+x2;
            h=na+","+nb;
            if(!vis.contains(h)){
                vis.add(h);
                qr.add(na);
                qc.add(nb);
            }
            int y2=Math.min(x-a,b);
            na=a+y2;
            nb=b-y2;
            h=na+","+nb;
            if(!vis.contains(h)){
                vis.add(h);
                qr.add(na);
                qc.add(nb);
            }
        }
        return false;
    }
}

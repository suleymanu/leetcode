class RecentCounter {
    int[] p = new int[10000];
    int a=0, b=-1, w=3000;

    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        p[++b]=t;
        while(p[b]-p[a]>w) a++;
        return b-a+1;
    }
}

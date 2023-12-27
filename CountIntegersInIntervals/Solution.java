class CountIntervals {
    
    TreeMap<Integer,Integer> m;
    int c;
    
    public CountIntervals() {
        m = new TreeMap<Integer,Integer>();
        c = 0;
    }
    
    public void add(int left, int right) {
        var e = m.floorEntry(left);
        if(e==null||e.getValue()<left) e=m.higherEntry(left);
        for(;e!=null&&e.getKey()<=right;e=m.higherEntry(left)) {
            left = Math.min(left,e.getKey());
            right = Math.max(right,e.getValue());
            c -= e.getValue()-e.getKey()+1;
            m.remove(e.getKey());
        }
        m.put(left, right);
        c += right-left+1;
    }
    
    public int count() {
        return c;
    }
}

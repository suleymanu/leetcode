class RandomizedSet {
    List<Integer> l;
    Map<Integer,Integer> m;
    Random r = new Random();

    public RandomizedSet() {
        l = new ArrayList<Integer>();
        m = new HashMap<Integer,Integer>();
    }
    
    public boolean insert(int val) {
        if(m.containsKey(val)) return false;
        l.add(val);
        m.put(val,m.size());
        return true;
    }
    
    public boolean remove(int val) {
        if(!m.containsKey(val)) return false;
        int idx = m.get(val);
        if(idx < l.size()-1) {
            int t = l.get(l.size()-1);
            l.set(idx, t);
            m.put(t, idx);
        }
        l.remove(l.size()-1);
        m.remove(val);
        return true;
    }
    
    public int getRandom() {
        return l.get(r.nextInt(l.size()));
    }
}

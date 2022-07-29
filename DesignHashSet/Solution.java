/* Real HashSet to be implemented. */
class MyHashSet {
    
    int size = 1000001;
    int[] set;

    public MyHashSet() {
        this.set = new int[this.size];
    }
    
    public void add(int key) {
        this.set[key] = 1;
    }
    
    public void remove(int key) {
        this.set[key] = 0;
    }
    
    public boolean contains(int key) {
        return this.set[key]==1;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */

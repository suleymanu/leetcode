/* Basic approach using array. Comprehensive Hash Map to be implemented. */
class MyHashMap {
    
    int n = 1000001;
    int[] map = new int[n];

    public MyHashMap() {
        for(int i=0; i<n; i++)
            map[i] = -1;
    }
    
    public void put(int key, int value) {
        map[key] = value;
    }
    
    public int get(int key) {
        return map[key];
    }
    
    public void remove(int key) {
        map[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

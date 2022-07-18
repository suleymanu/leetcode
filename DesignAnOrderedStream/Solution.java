/* Uses hash map. */
class OrderedStream {
    
    Map<Integer,String> map;
    int s = 1;

    public OrderedStream(int n) {
        map = new HashMap(n);
    }
    
    public List<String> insert(int idKey, String value) {
        map.put(idKey, value);
        List<String> res = new ArrayList();
        while(map.containsKey(s)) {
            res.add(map.get(s));
            s++;
        }
        return res;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */

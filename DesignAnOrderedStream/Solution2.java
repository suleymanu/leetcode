/* No need to use map since we'll have 1 to n indexing. Here is array approach. */
class OrderedStream {
    
    String[] a;
    int s = 1;

    public OrderedStream(int n) {
        a = new String[n+1];
    }
    
    public List<String> insert(int idKey, String value) {
        a[idKey] = value;
        List<String> res = new ArrayList();
        while(s<a.length && a[s] != null) {
            res.add(a[s]);
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

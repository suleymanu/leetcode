class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> m1 = new HashMap();
        Map<Integer,Integer> m2 = new HashMap();
        for(int n:nums1)
            m1.put(n,m1.getOrDefault(n,0)+1);
        for(int n:nums2)
            m2.put(n,m2.getOrDefault(n,0)+1);
        List<Integer> result = new ArrayList();
        for(int n:m1.keySet()) {
            for(int i=0; i<Math.min(m1.getOrDefault(n,0),m2.getOrDefault(n,0)); i++)
                result.add(n);
        }
        int[] res = new int[result.size()];
        for(int i=0; i<result.size(); i++)
            res[i] = result.get(i);
        return res;
    }
}

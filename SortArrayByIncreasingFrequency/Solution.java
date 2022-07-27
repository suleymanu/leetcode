/* Collections.sort(). */
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> m = new HashMap();
        for(int n:nums) m.put(n,m.getOrDefault(n,0)+1);
        List<Map.Entry<Integer,Integer>> l = new ArrayList(m.entrySet());
        Collections.sort(l,(a,b)->a.getValue()==b.getValue()?b.getKey()-a.getKey():a.getValue()-b.getValue());
        int x=0;
        int[] r = new int[nums.length];
        for(Map.Entry e:l)
            for(int i=0;i<(int)e.getValue();i++)
                r[x++] = (int)e.getKey();
        return r;
    }
}

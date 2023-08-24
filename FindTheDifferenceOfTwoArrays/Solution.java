/* Using HashSet. O(n). */
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> a=new HashSet(), b=new HashSet();
        Set<Integer> m = new HashSet(), n=new HashSet();
        List<List<Integer>> r = new ArrayList();
        for(int i:nums1) a.add(i);
        for(int i:nums2) b.add(i);
        for(int i:nums1) if(!b.contains(i)) m.add(i);
        for(int i:nums2) if(!a.contains(i)) n.add(i);
        r.add(List.copyOf(m));
        r.add(List.copyOf(n));
        return r;
    }
}

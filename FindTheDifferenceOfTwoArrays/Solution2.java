/* Array indexing. */
class Solution2 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> m=new ArrayList(), n=new ArrayList();
        List<List<Integer>> r = new ArrayList();
        int[] a=new int[2001], b=new int[2001];
        for(int i:nums1) a[i+1000]=1;
        for(int i:nums2) b[i+1000]=1;
        for(int i=0; i<2001; i++) {
            if(a[i]==1 && b[i]==0) m.add(i-1000);
            else if(b[i]==1 && a[i]==0) n.add(i-1000);
        }
        r.add(m); r.add(n);
        return r;
    }
}

/* O(n) time. O(n) space. Uses hash set. */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int l = 1001;
        int[] a1 = new int[l], b1 = new int[l];
        Set<Integer> res = new HashSet();
        for(int n : nums1)
            a1[n] = 1;
        for(int n : nums2)
            if(a1[n]==1)
                res.add(n);
        return res.stream().mapToInt(i -> i).toArray();
    }
}

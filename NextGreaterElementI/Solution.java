class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int size = 10001;
        int[] nge = new int[size];
        for(int i=0; i<size; i++)
            nge[i] = -1;
        int[] stack = new int[nums2.length];
        int si = -1;
        for(int i=0; i<nums2.length; i++) {
            while(si>=0 && stack[si]<nums2[i])
                nge[stack[si--]] = nums2[i];
            stack[++si] = nums2[i];
        }
        int[] res = new int[nums1.length];
        for(int i=0; i<nums1.length; i++)
            res[i] = nge[nums1[i]];
        return res;
    }
}

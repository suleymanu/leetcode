/* O(n) time. O(1) space. */
class Solution {
    public int maximumProduct(int[] nums) {
        int[] min = new int[2];
        int[] max = new int[3];
        for(int i=0; i<2; i++) min[i] = Integer.MAX_VALUE;
        for(int i=0; i<3; i++) max[i] = Integer.MIN_VALUE;
        for(int n:nums) {
            if(n<=min[0]) {
                min[1] = min[0];
                min[0] = n;
            } else if(n<=min[1])
                min[1] = n;
            if(n>=max[0]) {
                max[2] = max[1];
                max[1] = max[0];
                max[0] = n;
            } else if(n>=max[1]) {
                max[2] = max[1];
                max[1] = n;
            } else if(n>=max[2])
                max[2] = n;
        }
        return Math.max(min[0]*min[1]*max[0],max[0]*max[1]*max[2]);
    }
}

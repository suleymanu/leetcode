class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] r = new int[n*2];
        for(int i=0; i<n; i++) {
            r[i*2] = nums[i];
            r[i*2+1] = nums[n+i];
        }
        return r;
    }
}

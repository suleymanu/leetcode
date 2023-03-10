/* Dynamic bottom-up. */
class Solution2 {
    public int maximumScore(int[] nums, int[] multipliers) {
        int[][] m = new int[multipliers.length+1][multipliers.length+1];
        for(int i=multipliers.length-1; i>=0; i--)
            for(int l=i; l>=0; l--)
                m[i][l] = Math.max(multipliers[i]*nums[l]+m[i+1][l+1],multipliers[i]*nums[nums.length-1-i+l]+m[i+1][l]);
        return m[0][0];
    }
}

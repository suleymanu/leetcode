class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] res = new int[queries.length];
        for(int i=0; i<queries.length; i++) {
            int sum=0, j;
            for(j=0; j<nums.length; j++) {
                sum += nums[j];
                if(sum>queries[i]) break;
            }
            res[i] = j;
        }
        return res;
    }
}

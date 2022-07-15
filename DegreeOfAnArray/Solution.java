/* O(n) time. O(n) space. 3 hash maps. */
class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> occurMap = new HashMap(), 
                right = new HashMap(), 
                left = new HashMap();
        for(int i=0; i<nums.length; i++) {
            occurMap.put(nums[i],occurMap.getOrDefault(nums[i],0)+1);
            if(left.get(nums[i])==null)
                left.put(nums[i],i);
            right.put(nums[i],i);
        }
        int ans = nums.length;
        int maxOccur = Collections.max(occurMap.values());
        for(int key : occurMap.keySet())
            if(occurMap.get(key) == maxOccur)
                ans = Math.min(right.get(key)-left.get(key)+1,ans);
        return ans;
    }
}

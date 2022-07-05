/* O(1) time. O(n) space. Uses hash table. */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for(int i=0; i<nums.length; i++) {
            Integer val = map.get(target-nums[i]);
            if(val!=null)
                return new int[]{i,val};
            else
                map.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}

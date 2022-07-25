/* Use getOrDefault and remove absolute value. */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        for(int i=0; i<nums.length; i++) {
            if(i-map.getOrDefault(nums[i],i-k-1)<=k) return true;
            map.put(nums[i],i);
        }
        return false;
    }
}

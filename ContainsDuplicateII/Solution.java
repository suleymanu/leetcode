/* First attempt (after unnecessarily using a list). */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        for(int i=0; i<nums.length; i++) {
            Integer v = map.get(nums[i]);
            if(v!=null && Math.abs(i-v)<=k) return true;
            map.put(nums[i],i);
        }
        return false;
    }
}

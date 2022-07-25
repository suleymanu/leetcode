/* Utilizes return value of Map.put(). */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        for(int i=0; i<nums.length; i++) {
            Integer o = map.put(nums[i],i);
            if(o!=null && i-o<=k) return true;
        }
        return false;
    }
}

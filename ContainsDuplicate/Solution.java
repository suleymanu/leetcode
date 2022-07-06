/* O(n) time. O(n) space. Uses hash map. */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for(int i:nums) {
            if(map.containsKey(i))
                return true;
            map.put(i,0);
        }
        return false;
    }
}

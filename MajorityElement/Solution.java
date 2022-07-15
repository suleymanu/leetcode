/* O(n) time. O(n) space. Uses hash map. Consider O(1) space version: Boyer-Moore Voting Algorithm. */
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> occur = new HashMap();
        for(int n : nums) {
            int oc = occur.getOrDefault(n,0)+1;
            if(oc>nums.length/2)
                return n;
            else
                occur.put(n,oc);
        }
        return -1;
    }
}

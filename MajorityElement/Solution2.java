/* O(n) time. O(1) space. Boyer-Moore Voting Algorithm. */
class Solution2 {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = -1;
        for(int n : nums) {
            if(count == 0)
                candidate = n;
            count += candidate==n ? 1 : -1;
        }
        return candidate;
    }
}

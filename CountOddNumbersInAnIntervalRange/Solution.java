/* O(1) time. O(1) space. Uses bitwise AND and OR instead of modulus. */
class Solution {
    public int countOdds(int low, int high) {
        return (high-low)/2 + (low&1|high&1);
    }
}

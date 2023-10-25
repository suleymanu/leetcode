// Backtracking w/o memoization. Not efficient.
class Solution {
    public boolean canJump(int[] nums) {
        return canJump(0, nums);
    }

    public boolean canJump(int pos, int[] nums) {
        if(pos==nums.length-1) return true;
        int jump = Math.min(pos+nums[pos], nums.length-1);
        for(int i=pos+1; i<= jump; i++)
            if(canJump(i,nums)) return true;
        return false;
    }
}

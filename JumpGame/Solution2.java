// Dynamic top-down
class Solution {
    int[] m;

    public boolean canJump(int[] nums) {
        m=new int[nums.length];
        m[m.length-1]=1;
        return canJump(0, nums);
    }

    public boolean canJump(int pos, int[] nums) {
        if(m[pos]!=0) return m[pos]==1?true:false;
        int jump = Math.min(pos+nums[pos], nums.length-1);
        for(int i=pos+1; i<=jump; ++i)
            if(canJump(i,nums)) {
                m[i]=1;
                return true;
            }
        m[pos]=-1;
        return false;
    }
}

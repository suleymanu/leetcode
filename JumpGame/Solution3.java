// Dynamic bottom-up
class Solution {
    public boolean canJump(int[] nums) {
        int[] m=new int[nums.length];
        m[m.length-1]=1;
        for(int i=m.length-2; i>=0; --i) {
            int jump=Math.min(i+nums[i],m.length-1);
            for(int j=i+1; j<=jump; ++j)
                if(m[j]==1) {
                    m[i]=1; break;
                }
        }
        return m[0]==1;
    }
}

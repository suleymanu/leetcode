// Monotonic stacks and DP.
class Solution {
    public long minCost(int[] nums, int[] costs) {
        Deque<Integer> p=new ArrayDeque(), q=new ArrayDeque();
        long[] m = new long[nums.length];
        Arrays.fill(m,Long.MAX_VALUE);
        m[0] = 0;
        for(int i=0; i<nums.length; i++) {
            while(!p.isEmpty() && nums[i]>=nums[p.peek()])
                m[i] = Math.min(m[i],m[p.pop()]+costs[i]);
            while(!q.isEmpty() && nums[i]<nums[q.peek()])
                m[i] = Math.min(m[i],m[q.pop()]+costs[i]);
            p.push(i); q.push(i);
        }
        return m[nums.length-1];
    }
}

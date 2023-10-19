// No set. Just check map's size.
class Solution2 {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap();
        long r=0, a=0;
        for(int i=0; i<k; i++) {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            a+=nums[i];
        }
        if(m.size()==k) r=a;
        for(int i=k; i<nums.length; i++) {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            a+=nums[i];
            int v=m.get(nums[i-k]);
            if(v==1) m.remove(nums[i-k]); else m.put(nums[i-k],v-1);
            a-=nums[i-k];
            if(m.size()==k && a>r) r=a;
        }
        return r;
    }
}

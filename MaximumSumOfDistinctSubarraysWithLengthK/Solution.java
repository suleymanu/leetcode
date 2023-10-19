// First trial. No set needed.
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap();
        Set<Integer> s = new HashSet();
        long r=0, a=0;
        for(int i=0; i<k; i++) {
            int c=m.getOrDefault(nums[i],0);
            if(c!=0) s.add(nums[i]);
            m.put(nums[i],c+1);
            a+=nums[i];
        }
        if(s.isEmpty()) r=a;
        for(int i=k; i<nums.length; i++) {
            int c=m.getOrDefault(nums[i],0);
            if(c==1) s.add(nums[i]);
            m.put(nums[i],c+1);
            a+=nums[i];
            c=m.get(nums[i-k]);
            if(c==2) s.remove(nums[i-k]);
            m.put(nums[i-k],c-1);
            a-=nums[i-k];
            if(s.isEmpty() && a>r) r=a;
        }
        return r;
    }
}

// Divide into chunks where elements are k-apart. Find indv. subsets. Combine.
class Solution {
    public long countTheNumOfKFreeSubsets(int[] nums, int k) {
        long[] d = new long[nums.length+1];
        d[0]=0; d[1]=1;
        for(int i=2;i<nums.length+1;i++) d[i]=d[i-1]+d[i-2]+1;
        Arrays.sort(nums);
        Map<Integer,Integer> m = new HashMap();
        for(int n:nums) {
            int c = m.getOrDefault(n-k,0);
            m.remove(n-k);
            m.put(n,c+1);
        }
        long r=1;
        for(int n:m.values()) r*=(d[n]+1);
        return r;
    }
}

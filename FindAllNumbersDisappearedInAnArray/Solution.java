/* O(n) time. O(1) memory (in-space). */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> r = new ArrayList();
        for(int n:nums) nums[Math.abs(n)-1]=-Math.abs(nums[Math.abs(n)-1]);
        for(int i=0; i<nums.length; i++) if(nums[i]>0) r.add(i+1);
        return r;
    }
}

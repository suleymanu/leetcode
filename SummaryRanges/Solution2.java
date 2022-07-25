/* One variable. */
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList();
        if(nums.length==0) return result;
        int l=nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i]>nums[i-1]+1) {
                if(l==nums[i-1])
                    result.add(Integer.toString(l));
                else 
                    result.add(Integer.toString(l)+"->"+Integer.toString(nums[i-1]));
                l = nums[i];
            }
        }
        if(l==nums[nums.length-1])
            result.add(Integer.toString(l));
        else
            result.add(Integer.toString(l)+"->"+Integer.toString(nums[nums.length-1]));
        return result;
    }
}

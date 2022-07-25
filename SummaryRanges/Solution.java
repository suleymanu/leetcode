/* O(n) time. O(1) space. First trial. */
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList();
        if(nums.length==0) return result;
        int l=nums[0], r=nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i]==r+1)
                r++;
            else if(nums[i]>r+1) {
                if(l==r)
                    result.add(Integer.toString(l));
                else 
                    result.add(Integer.toString(l)+"->"+Integer.toString(r));
                l = r = nums[i];
            }
        }
        if(l==r)
            result.add(Integer.toString(l));
        else
            result.add(Integer.toString(l)+"->"+Integer.toString(r));
        return result;
    }
}

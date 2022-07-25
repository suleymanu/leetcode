/* Shorter. Two loops. No repeating code. */
class Solution3 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList();
        for(int i=0; i<nums.length; i++) {
            int l=nums[i];
            while(i<nums.length-1 && nums[i]+1==nums[i+1]) i++;
            if(l==nums[i]) result.add(l+"");
            else result.add(l+"->"+nums[i]);
        }
        return result;
    }
}

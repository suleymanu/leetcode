/* O(n) time but also O(n) space. Could be O(1) space. */
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        List<Integer> l = new ArrayList<>();
        int ec = 0, res = 0;
        for(int n:nums) {
            if(n%2==1) {
                l.add(ec);
                ec =0 ;
            } else ++ec;
        }
        l.add(ec);
        for(int i=0; i+k<l.size(); ++i)
            res += (l.get(i)+1) * (l.get(i+k)+1);
        return res;
    }
}

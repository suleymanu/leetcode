/* Counting sort. */
class Solution2 {
    public int arrayPairSum(int[] nums) {
        int s=10000, r=0, p=0;
        int[] c = new int[2*s+1];
        for(int i:nums) c[i+s]++;
        for(int i=0; i<=s*2; ++i) {
            if(c[i]!=0) {
                r += (c[i]-p+1)/2*(i-s);
                p = (c[i]-p)%2;
            }
        }
        return r;
    }
}

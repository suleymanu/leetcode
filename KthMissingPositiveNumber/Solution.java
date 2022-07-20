/* O(logn) time. O(1) space. */
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l=0, r=arr.length-1;
        while(l<=r) {
            int i=l+(r-l)/2;
            if(arr[i]-(i+1)<k)
                l = i+1;
            else
                r = i-1;
        }
        return l+k;
    }
}

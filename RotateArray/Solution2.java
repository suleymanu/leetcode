// 2 swaps but unnecessary writings (2 times instead of 1)
class Solution2 {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        if(k==0) return;
        swap(nums,0,nums.length-1);
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);
    }

    public void swap(int[] a, int s, int d) {
        while(s<d) {
            int t=a[s];
            a[s]=a[d];
            a[d]=t;
            s++; d--;
        }
    }
}

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] c = new int[n+1];
        //for(int i=0; i<=n; i++) c[i]=0;
        int k=0,sum=0;
        for(int num:nums) {
            if(c[num]==0) c[num]=1;
            else k=num;
            sum += num;
        }
        int s = (n*(n+1))/2 + k - sum;
        int[] r = new int[2];
        r[0] = k;
        r[1] = s;
        return r;
    }
}

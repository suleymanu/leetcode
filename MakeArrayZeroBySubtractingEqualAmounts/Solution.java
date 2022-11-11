class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        int[] m = new int[101];
        for(int i=0; i<101; i++) m[i]=0;
        for(int n:nums) if(n>0 && m[n]==0) {m[n]=1; c++;}
        return c;
    }
}

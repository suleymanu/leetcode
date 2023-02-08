class Solution {
    public boolean isUgly(int n) {
        if(n<1) return false;
        while(n%3==0) n/=3;
        while(n%5==0) n/=5;
        return (n&(n-1))==0;
    }
}

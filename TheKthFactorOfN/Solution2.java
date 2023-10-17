// O(sqrt(n))
class Solution {
    public int kthFactor(int n, int k) {
        int c=0;
        int[] d = new int[100];
        for(int i=1; i<=Math.sqrt(n); i++) {
            if(n%i==0) d[c++]=i;
            if(k==c) return i;
        }
        if(d[c-1]*d[c-1]==n) k++;
        return (k<=2*c) ? n/d[2*c-k] : -1;
    }
}

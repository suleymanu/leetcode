/* Classic solution. O(sqrt(n)). */
class Solution {
    public boolean checkPerfectNumber(int num) {
        int s=1;
        for(int i=2; i<=Math.sqrt(num); ++i) if(num%i==0) s+=i+num/i;
        return num!=1&&num==s;
    }
}

class Solution {
    public long minimumHealth(int[] damage, int armor) {
        long sum=0;
        int max=0;
        for(int d:damage) {
            sum += d;
            if(d>max) max=d;
        }
        return sum+1-Math.min(max,armor);
    }
}

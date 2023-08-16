class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> r = new ArrayList(candies.length);
        int x=0; for(int i:candies) if(i>x) x=i;
        for(int i:candies) r.add(i+extraCandies>=x);
        return r;
    }
}

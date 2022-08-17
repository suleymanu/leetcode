class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int suma=0, sumb=0;
        for(int a:aliceSizes) suma += a;
        for(int b:bobSizes) sumb += b;
        int dif = (sumb - suma) / 2;
        Set<Integer> setB = new HashSet();
        for(int b:bobSizes) setB.add(b);
        for(int a:aliceSizes)
            if(setB.contains(a+dif))
                return new int[]{a,a+dif};
        return null;
    }
}

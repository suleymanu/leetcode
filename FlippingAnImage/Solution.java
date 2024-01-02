class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        for(int[] r:image)
            for(int i=0; i<(n+1)/2; ++i)
                if((r[i]==r[n-1-i]))
                    r[i] = r[n-1-i] ^= 1;
        return image;
    }
}

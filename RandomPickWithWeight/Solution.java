class Solution {

    int s=0;
    int[] a;
    Random r = new Random();

    public Solution(int[] w) {
        for(int i=0; i<w.length; i++) w[i]=s+=w[i];
        a=w;
    }
    
    public int pickIndex() {
        int k = r.nextInt(s)+1;
        int x = Arrays.binarySearch(a, k);
        if(x<0) x=-x-1;
        return x;
    }
}

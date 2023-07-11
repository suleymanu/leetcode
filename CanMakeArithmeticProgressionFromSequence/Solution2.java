/* O(n) time. No sorting. */
class Solution2 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int min=1000000, max=-1000000;
        Set<Integer> s = new HashSet(arr.length);
        for(int a:arr) {
            if(a<min) min=a;
            if(a>max) max=a;
            s.add(a);
        }
        if((max-min)%(arr.length-1)!=0) return false;
        int d = (max-min)/(arr.length-1);
        if(d==0) return true;
        for(int i=min; i<=max; i+=d)
            if(!s.contains(i)) return false;
        return true;
    }
}

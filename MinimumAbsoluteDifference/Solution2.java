/* Counting sort */
class Solution2 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for(int a:arr) {
            min = Math.min(min,a);
            max = Math.max(max,a);
        }
        int len = max-min+1;
        int[] s = new int[len];
        int sf = min;
        for(int a:arr) s[a-sf] = 1;
        int p = min;
        int minD = 2000001;
        for(int i=1; i<len; i++) {
            if(s[i]==1) {
                if(i+sf-p<minD) minD = i+sf-p;
                p = i+sf;
            }
        }
        List<List<Integer>> r = new ArrayList();
        p = min;
        for(int i=1; i<len; i++) {
            if(s[i]==1) {
                if(i+sf-p==minD) r.add(Arrays.asList(p,i+sf));
                p = i+sf;
            }
        }
        return r;
    }
}

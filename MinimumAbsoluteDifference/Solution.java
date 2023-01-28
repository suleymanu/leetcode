class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minDiff = 2000001;
        List<List<Integer>> r = new ArrayList();
        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++) {
            int diff = arr[i]-arr[i-1];
            if(diff < minDiff) minDiff = diff;
        }
        for(int i=1; i<arr.length; i++) {
            if(arr[i]-arr[i-1] == minDiff) {
                List<Integer> l = new ArrayList(2);
                l.add(arr[i-1]);
                l.add(arr[i]);
                r.add(l);
            }
        }
        return r;
    }
}

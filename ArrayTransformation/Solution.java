class Solution {
    public List<Integer> transformArray(int[] arr) {
        boolean toBeChecked = true;
        while(toBeChecked) {
            toBeChecked = false;
            int l = arr[0];
            for(int i=1; i<arr.length-1; i++) {
                if(arr[i]<l && arr[i]<arr[i+1]) {
                    toBeChecked = true;
                    l = arr[i];
                    arr[i]++;
                }
                else if(arr[i]>l && arr[i]>arr[i+1]) {
                    toBeChecked = true;
                    l = arr[i];
                    arr[i]--;
                }
                else l = arr[i];
            }
        }
        List<Integer> result = new ArrayList();
        for(int n:arr)
            result.add(n);
        return result;
    }
}

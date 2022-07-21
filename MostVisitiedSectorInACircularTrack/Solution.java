class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> result = new ArrayList();
        int l = rounds.length;
        int a = rounds[0];
        int b = rounds[l-1];
        
        if(a<=b) for(int i=a; i<=b; i++) result.add(i);
        else {
            for(int i=1; i<=b; i++) result.add(i);
            for(int i=a; i<=n; i++) result.add(i);
        }
        
        return result;
    }
}

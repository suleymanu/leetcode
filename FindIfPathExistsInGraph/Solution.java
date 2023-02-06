class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>> m = new HashMap(n);
        for(int[] a : edges) {
            m.computeIfAbsent(a[0], v -> new ArrayList<Integer>()).add(a[1]);
            m.computeIfAbsent(a[1], v -> new ArrayList<Integer>()).add(a[0]);
        }
        boolean[] s = new boolean[n];
        s[source] = true;
        Queue<Integer> q = new LinkedList();
        q.offer(source);
        while(!q.isEmpty()) {
            int c = q.poll();
            if(c==destination) return true;
            for(int a : m.get(c))
                if(!s[a]) {s[a]=true; q.offer(a);}
        }
        return false;
    }
}

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] incLnkCnt = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        initGraph(incLnkCnt,adj,prerequisites);
        return bfs(incLnkCnt, adj);
    }

    private void initGraph(int[] ilc, List<List<Integer>> adj, int[][] pre) {
        int n = ilc.length;
        while(n-->0) adj.add(new ArrayList<>());
        for(int[] e:pre) {
            ilc[e[0]]++;
            adj.get(e[1]).add(e[0]);
        }
    }

    private int[] bfs(int[] ilc, List<List<Integer>> adj) {
        int[] o = new int[ilc.length];
        Queue<Integer> q = new ArrayDeque<>();
        // if no incoming link -> no prerequisite -> take that course
        for(int i=0; i<ilc.length; ++i) if(ilc[i]==0) q.offer(i);
        int v = 0;
        while(!q.isEmpty()) {
            int f = q.poll();
            o[v++] = f;
            for(int t:adj.get(f))
                if(--ilc[t]==0) q.offer(t);
        }
        return v==ilc.length?o:new int[]{};
    }
}

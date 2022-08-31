class Solution {
    private int binarySearch(int[] row) {
        int l=0; int r=row.length-1;
        while(l<=r) {
            int m = l + (r-l)/2;
            if(row[m]==1) l=m+1;
            else r=m-1;
        }
        return r;
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        Queue<int[]> q = new PriorityQueue<>((a,b)-> {
            if(a[0]==b[0]) return b[1]-a[1];
            else return b[0]-a[0];
        });
        for(int i=0; i<mat.length; i++) {
            int s = binarySearch(mat[i]);
            int[] e = new int[]{s,i};
            q.add(e);
            if(q.size()>k) q.poll();
        }
        int[] r = new int[k];
        for(int i=k-1; i>=0; --i) r[i] = q.poll()[1];
        return r;
    }
}

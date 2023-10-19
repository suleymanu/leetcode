class Solution {
    public int numIslands(char[][] grid) {
        int l=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                if(grid[i][j]=='1') {l++; sink(grid,i,j);}
        return l;
    }
    void sink(char[][] g, int i, int j) {
        if(i<0 || j<0 || i>=g.length || j>=g[0].length || g[i][j]!='1') return;
        g[i][j]='-';
        sink(g,i+1,j);
        sink(g,i-1,j);
        sink(g,i,j+1);
        sink(g,i,j-1);
    }
}

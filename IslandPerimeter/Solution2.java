/* Less branching. */
class Solution2 {
    public int islandPerimeter(int[][] grid) {
        int c=0, m=grid.length, n=grid[0].length;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j]==1) {
                    c+=4;
                    if(i>0 && grid[i-1][j]==1) c-=2;
                    if(j>0 && grid[i][j-1]==1) c-=2;
                }
            }
        }
        return c;
    }
}

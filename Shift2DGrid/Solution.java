class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList(grid.length);
        int m = grid.length;
        int n = grid[0].length;
        int size = m*n;
        int shift = k%size;
        int index = (size-shift)%size;
        for(int i=0; i<m; i++) {
            List<Integer> row = new ArrayList(grid[0].length);
            for(int j=0; j<n; j++) {
                row.add(grid[index/n][index%n]);
                index = (index+1)%size;
            }
            result.add(row);
        }
        return result;
    }
}

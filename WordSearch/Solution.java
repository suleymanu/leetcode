class Solution {
    public boolean exist(char[][] board, String word) {
        char[][] b = new char[board.length][board[0].length];
        for(int i=0; i<board.length; ++i)
            for(int j=0; j<board[0].length; ++j) {
                if(bfs(board,word,i,j,0)) return true;
            }
        return false;
    }

    protected boolean bfs(char[][] b, String w, int i, int j, int x) {
        if(i>=0 && i<b.length && j>=0 && j<b[0].length && b[i][j]==w.charAt(x)) {
            if(x==w.length()-1) return true;
            b[i][j] ^= 256;
            boolean r = bfs(b,w,i+1,j,x+1) || bfs(b,w,i-1,j,x+1) ||
                    bfs(b,w,i,j+1,x+1) || bfs(b,w,i,j-1,x+1);
            b[i][j] ^= 256;
            return r;
        }
        return false;
    }
}

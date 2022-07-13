/* O(n) time. O(n) space. Check after each move. */
class Solution {
    public String tictactoe(int[][] moves) {
        int n = 3;
        int[] rows = new int[n];
        int[] cols = new int[n];
        int[] diag = new int[2];
        int player = -1; //A:1 B:-1
        boolean w = false;
        for(int[] move : moves) {
            player *= -1; // switch
            int r = move[0];
            int c = move[1];
            rows[r] += player;
            if(Math.abs(rows[r]) == n) {w=true; break;}
            cols[c] += player;
            if(Math.abs(cols[c]) == n) {w=true; break;}
            if(r==c) diag[0] += player;
            if(Math.abs(diag[0]) == n) {w=true; break;}
            if(r+c==n-1) diag[1] += player;
            if(Math.abs(diag[1]) == n) {w=true; break;}
        }
        if(w) {
            return player==1 ? "A" : "B";
        } else {
            return moves.length == n*n ? "Draw" : "Pending";
        }
    }
}

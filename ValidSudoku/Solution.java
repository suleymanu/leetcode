class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] c = new int[10];
        for(int i=0; i<9; ++i) {
            for(int j=0; j<9; ++j) {
                char v = board[i][j];
                if(v!='.' && (++c[v-'0'])>1) return false;
            }
            Arrays.fill(c,0);
        }
        for(int i=0; i<9; ++i) {
            for(int j=0; j<9; ++j) {
                char v = board[j][i];
                if(v!='.' && (++c[v-'0'])>1) return false;
            }
            Arrays.fill(c,0);
        }
        for(int i=0; i<9; i+=3)
            for(int j=0; j<9; j+=3) {
                for(int k=i; k<i+3; ++k)
                    for(int l=j; l<j+3; ++l) {
                        char v = board[k][l];
                        if(v!='.' && (++c[v-'0'])>1) return false;
                    }
                Arrays.fill(c,0);
            }
        return true;
    }
}

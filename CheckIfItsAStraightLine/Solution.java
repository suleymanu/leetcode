class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2) return true;
        int xd = coordinates[0][0] - coordinates[1][0];
        int yd = coordinates[0][1] - coordinates[1][1];
        double r;
        if(xd!=0) r = (double)yd/xd;
        else r = (double)xd/yd;
        for(int i=1; i<coordinates.length; i++) {
            int xd2 = coordinates[i][0] - coordinates[0][0];
            int yd2 = coordinates[i][1] - coordinates[0][1];
            double r2;
            if(xd!=0) r2 = (double)yd2/xd2;
            else r2 = (double)xd2/yd2;
            if(r != r2) return false;
        }
        return true;
    }
}

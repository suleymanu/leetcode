/* Ugly BFS/ */
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int h=0, t=0;
        int o=image[sr][sc];
        if(o==color) return image;
        int m=image.length, n=image[0].length;
        int[][] q = new int[m*n][2];
        q[h][0] = sr;
        q[h][1] = sc;
        h++;
        image[q[t][0]][q[t][1]] = color;
        while(t<h) {
            if(q[t][0]>0 && image[q[t][0]-1][q[t][1]]==o) {
                q[h][0]=q[t][0]-1;
                q[h][1]=q[t][1];
                h++;
                image[q[t][0]-1][q[t][1]] = color;
            }
            if(q[t][0]<m-1 && image[q[t][0]+1][q[t][1]]==o) {
                q[h][0]=q[t][0]+1;
                q[h][1]=q[t][1];
                h++;
                image[q[t][0]+1][q[t][1]] = color;
            }
            if(q[t][1]>0 && image[q[t][0]][q[t][1]-1]==o) {
                q[h][0]=q[t][0];
                q[h][1]=q[t][1]-1;
                h++;
                image[q[t][0]][q[t][1]-1] = color;
            }
            if(q[t][1]<n-1 && image[q[t][0]][q[t][1]+1]==o) {
                q[h][0]=q[t][0];
                q[h][1]=q[t][1]+1;
                h++;
                image[q[t][0]][q[t][1]+1] = color;
            }
            t++;
        }
        return image;
    }
}

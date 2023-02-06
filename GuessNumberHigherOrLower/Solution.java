public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int s=0, e=(int)Math.pow(2,31)-1;
        while(true) {
            int m = s + (e-s)/2;
            int g = guess(m);
            if(g==0) return m;
            else if(g<0) e=m-1;
            else s=m+1;
        }
    }
}

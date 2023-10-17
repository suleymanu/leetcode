// Sliding window
class Solution {
    public int minSwaps(int[] data) {
        int o=0, w=0, x=0;;
        for(int i=0; i<data.length; i++) o+=data[i];
        for(int i=0; i<o; i++) w+=data[i];
        x=w;
        for(int i=o; i<data.length; i++) {
            w+=data[i];
            w-=data[i-o];
            x=Math.max(x,w);
        }
        return o-x;
    }
}

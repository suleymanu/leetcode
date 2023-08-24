/* Binary search. O(logn). */
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target=='z') return letters[0];
        int l=0, r=letters.length-1;
        while(l<=r) {
            int m=l+(r-l)/2;
            if(letters[m] > target) r=m-1;
            else l=m+1;
        }
        return letters[l%letters.length];
    }
}

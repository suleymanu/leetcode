/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
/* O(logn) time. O(n) space. O(1) aux space. Be careful about integer overflow. */
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s=1, e=n;
        while(s<e) {
            int c = s+(e-s)/2;
            if(isBadVersion(c))
                e = c;
            else
                s = c+1;
        }
        return s;
    }
}

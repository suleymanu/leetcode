/* O(n) time. O(1) space. Uses string instead of integer division. */
class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        char[] a = s.toCharArray();
        int i=0, j=a.length-1;
        while(i<j) {
            if(a[i] != a[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}

/* One-liner */
class Solution2 {
    public int maximum69Number (int num) {
        return Integer.parseInt(("" + num).replaceFirst("6", "9"));
    }
}

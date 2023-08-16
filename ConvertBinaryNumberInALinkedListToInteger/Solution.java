/* O(n) time. O(1) space. */
class Solution {
    public int getDecimalValue(ListNode head) {
        int r=0;
        while(head!=null) {r*=2; r+=head.val; head=head.next;}
        return r;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/* Clean version. No need to start with head.next. */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode p=null, n=head;
        while(n != null) {
            ListNode t = n.next;
            n.next = p;
            p = n;
            n = t;
        }
        return p;
    }
}

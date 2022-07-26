/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
/* Two pointers. */
public class Solution2 {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode s=head, f=head.next;
        while(f!= null && f.next!=null ) {
            if(s == f)
                return true;
            s = s.next;
            f = f.next.next;
        }
        return false;
    }
}

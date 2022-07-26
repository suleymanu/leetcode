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
/* O(n) time. O(n) space. Hash. */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet();
        while(head!=null) {
            if(set.add(head)==false) return true;
            head = head.next;
        }
        return false;
    }
}

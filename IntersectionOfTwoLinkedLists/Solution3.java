/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 /* One map/set. Add first list first. */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> map = new HashSet();
        while(headA!=null) {
            map.add(headA);
            headA=headA.next;
        }
        while(headB!=null) {
            if(map.contains(headB)) return headB;
            headB=headB.next;
        }
        return null;
    }
}

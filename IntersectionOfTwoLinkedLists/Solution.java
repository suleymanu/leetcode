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
/* Two maps. Unnecesarry. */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode,Boolean> mapA = new HashMap();
        Map<ListNode,Boolean> mapB = new HashMap();
        ListNode n = null;
        while(headA!=null || headB!=null) {
            mapA.put(headA,true);
            mapB.put(headB,true);
            if(mapB.containsKey(headA)) return headA;
            if(mapA.containsKey(headB)) return headB;
            if(headA!=null) headA=headA.next;
            if(headB!=null) headB=headB.next;
        }
        return null;
    }
}

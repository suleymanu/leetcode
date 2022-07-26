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
 /* One map but complicated. */
public class Solution2 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode,Boolean> map = new HashMap();
        while(headA!=null || headB!=null) {
            System.out.print(headA!=null?headA.val:"null");
            if(headA==headB) return headA;
            if(map.containsKey(headA)) return headA;
            if(map.containsKey(headB)) return headB;
            if(headA!=null) {
                map.put(headA,true);
                headA=headA.next;
            }
            if(headB!=null) {
                map.put(headB,true);
                headB=headB.next;
            }
        }
        return null;
    }
}

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
/* O(n) time. O(n) space. Uses an additional list. */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        for(ListNode trace = head; trace!=null; trace = trace.next)
            list.add(trace.val);
        for(int i=0; i<list.size()/2; i++)
            if(list.get(i) != list.get(list.size()-1-i))
                return false;
        return true;
    }
}

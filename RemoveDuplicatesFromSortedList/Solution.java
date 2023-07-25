/* Efficient when there are many duplicates. It only (re)creates the neccessary links. */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode c, p = head;
        for(c=p.next; c!=null; c=c.next)
            if(c.val!=p.val) {p.next=c; p=c;}
        p.next=null;
        return head;
    }
}

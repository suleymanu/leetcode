class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val) head=head.next;
        ListNode n = new ListNode(0);
        n.next = head;
        while(n.next!=null) {
            if(n.next.val==val) n.next=n.next.next;
            else n = n.next;
        }
        return head;
    }
}

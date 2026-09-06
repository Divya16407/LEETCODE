class Solution {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        head = head.next;
        ListNode prev = null;
        while (temp != null && temp.next != null) {
            ListNode c=temp.next;
            ListNode x=c.next;
            c.next=temp;
            temp.next=x;
            if(prev!=null){
                prev.next=c;
            }
            prev=temp;
            temp=x;
        }
        return head;
    }
}
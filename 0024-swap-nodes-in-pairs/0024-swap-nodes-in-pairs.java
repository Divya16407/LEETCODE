class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        // First pair: 1 → 2 becomes 2 → 1
        ListNode temp = head;
        head = head.next;

        temp.next = head.next;
        head.next = temp;

        // Now temp is 1
        // temp.next is the first node of the next pair

        while (temp.next != null && temp.next.next != null) {

            ListNode c = temp.next;       // 3
            ListNode x = c.next;          // 4
            ListNode y = x.next;         // node after 4

            temp.next = x;               // 1 → 4
            x.next = c;                  // 4 → 3
            c.next = y;                 

            temp = c;
        }

        return head;
    }
}
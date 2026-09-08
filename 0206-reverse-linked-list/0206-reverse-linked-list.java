class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode temp = head;
        ListNode x = null;

        while(temp != null){
            ListNode next = temp.next;  
            temp.next = x;              
            x = temp;                   
            temp = next;                
        }

        return x;                       
    }
}
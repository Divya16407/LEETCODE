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
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head.next==null){
            return true;
        }
        ListNode temp=head;
        String s1="";
        while(temp!=null){
            String x=String.valueOf(temp.val);
            s1+=x;
            temp=temp.next;
        }
        StringBuilder sb=new StringBuilder(s1);
        sb.reverse();
        String y=sb.toString();
        if(s1.equals(y)){
            return true;
        }
        return false;
    }
}
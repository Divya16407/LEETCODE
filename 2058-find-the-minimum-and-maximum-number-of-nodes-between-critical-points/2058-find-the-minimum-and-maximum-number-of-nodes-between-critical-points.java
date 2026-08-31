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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        int count=0;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        if(count==1 || count==2){
            return new int[] {-1,-1};
        }
        ListNode t=head;
        int c=1;
        while(t.next.next!=null){
            c++;
            if(t.next.val>t.val && t.next.val>t.next.next.val){
                arr.add(c);
            }
            if(t.next.val<t.val && t.next.val<t.next.next.val){
                arr.add(c);
            }
            t=t.next;
        }
        if(arr.size()<2){
            return new int[] {-1,-1};
        }
        int min = Integer.MAX_VALUE;
        int max = arr.get(arr.size() - 1) - arr.get(0);

        for(int i = 1; i < arr.size(); i++){
            int x = arr.get(i) - arr.get(i - 1);
            min = Math.min(min, x);
        }

        return new int[] {min, max};
    }
}
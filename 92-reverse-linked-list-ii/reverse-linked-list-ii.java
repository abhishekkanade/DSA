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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head==null || left==right) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next=head;

        ListNode t1 = dummy;

        for(int i=1; i<left; i++) t1=t1.next;   //Preserve before left

        ListNode t2 = t1.next;
        ListNode prev = null;
        ListNode curr = t2;

        for(int i=left; i<=right; i++){
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr = next;
        }

        t1.next = prev;
        t2.next= curr;

        return dummy.next;
    }
}
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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return;

        ListNode slow=head;
        ListNode fast=head;

        while(fast.next.next != null && fast.next.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        } 

        ListNode prev=null;
        ListNode curr=slow.next;
        ListNode front=curr.next;
        slow.next=null;

        while(curr != null){
            curr.next=prev;
            prev=curr;
            curr=front;
            if(front!=null) front = front.next;
        }
        ListNode head2 = prev;

        while(true){
            ListNode temp=head.next;
            head.next=head2;
            head=temp;
            ListNode temp2 = head2.next;
            if(head==null) break;
            head2.next=head;
            head2=temp2;
        }
        



    }
}
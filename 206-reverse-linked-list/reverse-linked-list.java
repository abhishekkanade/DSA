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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode t1 = head;
        ListNode t2 = head.next;
        ListNode t3 = t2.next;

        while(t2!=null){
            t2.next = t1;
            if(t1==head) t1.next=null;
            t1=t2;
            t2=t3;
            if(t3!=null) t3=t3.next;
        }
        head=t1;
        return head;
    }
}
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //if(head!=null || head.next==null)
    
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode dummy = new ListNode(0);
        ListNode temp=dummy;

        int carry=0;
        int num1=0;
        int num2=0;

        while(temp1!=null || temp2!=null || carry!=0){
            
            if(temp1==null) num1=0;
            else num1=temp1.val;
            if(temp2==null) num2=0;
            else num2=temp2.val;

            int sum = num1 + num2 + carry;
            ListNode node = new ListNode(sum%10);
            dummy.next=node;
            dummy=node;
            carry = sum/10;

            if(temp1!=null) temp1=temp1.next;
            if(temp2!=null) temp2=temp2.next;

        }

        return temp.next;

    }
}

// ListNode prev=null;
//         ListNode curr=l1;
//         ListNode front=curr.next;

//         while(curr != null){
//             curr.next = prev;
//             prev=l1;
//             l1=front;
//             if(front!=null) front=front.next;
//         }
//         ListNode head1 = prev;

//         prev=null;
//         curr=l2;
//         front=curr.next;

//         while(curr != null){
//             curr.next = prev;
//             prev=l1;
//             l1=front;
//             if(front!=null) front=front.next;
//         }
//         ListNode head2 = prev;
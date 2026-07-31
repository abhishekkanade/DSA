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

        if(head==null || head.next==null) return true;


// OPTIMAL
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next !=null && fast.next.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode prev=null;
        ListNode curr=slow.next;
        ListNode front=curr.next;
        slow.next=null;

        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=front;
            if(front!=null) front =front.next;
        }
        ListNode head2=prev;

        while(head !=null && head2!=null){
            if(head.val!=head2.val) 
                return false;
            
            head=head.next;
            head2=head2.next;
        }
        return true;
        


// BRUTE EXTRA SPACE O(N)
        // Stack <Integer> st=new Stack<>();            //USING STACK, CAN SOLVED BY TWO POINTER EASILY
        // ListNode temp=head;
        // while(temp !=null){
        //     st.push(temp.val);
        //     temp=temp.next;
        // }
        
        // while(head!= null && !st.isEmpty()){
        //     if(head.val == st.pop()){
        //         head=head.next;
        //         continue;
        //     } 
        //     return false;
        // }
        // return st.isEmpty();

    }
}
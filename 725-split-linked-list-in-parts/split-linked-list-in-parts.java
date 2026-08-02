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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size=0;
        int extra=0;
        int total=0;
        ListNode temp=head; 
        ListNode[] ans= new ListNode[k];

        while(temp!=null){
            total++;
            temp=temp.next;
        }
        size = total / k;
        extra = total % k;

        temp=head;
        int len=1;
        int i=0;

        while(temp != null){
            int s=size;
            if(len==1) ans[i++]=temp;
            if(extra>0){
                s += 1;
            }
            if(len==s){
                ListNode a=temp.next;
                temp.next=null;
                temp=a;
                len=1;
                extra--;
            }
            else{
                len++;
                temp=temp.next;
            }

        }

        return ans;
    }
}
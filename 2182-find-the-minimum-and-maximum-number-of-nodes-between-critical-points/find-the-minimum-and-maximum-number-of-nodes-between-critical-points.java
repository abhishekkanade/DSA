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
        ListNode prev=head;
        ListNode curr=prev.next;
        ListNode next=curr.next;

        int[] ans={-1, -1};
        int first=-1;
        int last=-1;
        int idx=1;
        int maxnum=0;
        int minnum=Integer.MAX_VALUE;
        int dist;

        while(next != null){
            if((prev.val<curr.val && next.val<curr.val) || (prev.val>curr.val && next.val>curr.val) ){
                if(first== -1) first=idx;
                if(last!=-1){
                    dist=idx-last;
                    minnum=Math.min(dist, minnum);
                }
                last=idx;
            }
            
            idx++;
            prev=prev.next;
            curr=curr.next;
            next=next.next;
        } 
        if(first==last) return ans;
        maxnum=last-first;
        ans[0] = minnum;
        ans[1] = maxnum;


        return ans;
    }
}
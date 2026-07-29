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
    public ListNode mergeKLists(ListNode[] lists) {

// OPTIMAL - BINARY SEARCH
        if(lists.length==0) return null;

        return divide(lists, 0, lists.length-1);


// BRUTE FORCE 
        // if(lists.length==0) return null;
        // if(lists.length==1) return lists[0];
        // ArrayList<ListNode> arrlist = new ArrayList<>();
        // for(ListNode sll : lists){
        //     arrlist.add(sll);
        // }

        // while(arrlist.size()>1){
        //     ListNode list1 = arrlist.remove(arrlist.size()-2);
        //     ListNode list2 = arrlist.remove(arrlist.size()-1);
            
        //     ListNode newlist = merge(list1, list2);
        //     arrlist.add(newlist);
        // }

        // return arrlist.get(0);
    }


    ListNode divide(ListNode[] lists, int low, int high){
        if(low==high) return lists[low];

        int mid = low+(high-low)/2;

        ListNode temp1 = divide(lists, low, mid);
        ListNode temp2 = divide(lists, mid+1, high);

        return merge(temp1, temp2);
    }


    ListNode merge(ListNode list1, ListNode list2){
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode dummy = new ListNode();
        ListNode t = dummy;

        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                t.next = t1;
                t1 = t1.next;
            }
            else{
                t.next = t2;
                t2 = t2.next;
            }
            t=t.next;
        }

        if(t1 == null) t.next = t2;
        else t.next = t1;

        return dummy.next;
        
    }
}
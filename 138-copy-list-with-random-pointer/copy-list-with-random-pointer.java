/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp1 = head;
        Node dummy=new Node(0);
        Node temp2=dummy;
        while(temp1 != null){
            Node node = new Node(temp1.val);
            temp2.next = node;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }

        temp1=head;
        Node head2=dummy.next;
        temp2 = head2;
        Node t = dummy;

        while(temp2!=null){
            t.next=temp1;
            temp1=temp1.next;
            t=t.next;
            t.next=temp2;
            temp2=temp2.next;
            t=t.next;
        }

        temp1=head;
        temp2=head2;

        while( temp1!=null  && temp2!=null ){
            if(temp1.random !=null) temp2.random=temp1.random.next;
            else temp2.random=null;
            temp1=temp2.next;
            if(temp1!=null) temp2=temp1.next;


        }

        temp1=head;
        temp2=head2;

        while(temp2!=null){
            temp1.next=temp2.next;
            temp1=temp1.next;
            if(temp1!=null)  temp2.next=temp1.next;
            temp2=temp2.next;
        }
        
        return head2;
    }
}
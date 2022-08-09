/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node addElement(Node head, int k) {
    Node temp=new Node(k);
    Node curr=head;
    while(curr.next!=null){
        curr=curr.next;
    }
    curr.next=temp;
    return head;
}

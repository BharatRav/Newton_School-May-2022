/*

class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/


public static Node insertnew(Node head,int k) { 
    Node temp=new Node(k);
    temp.next=head;
    head.prev=temp;
    head=temp;
    return head;
}

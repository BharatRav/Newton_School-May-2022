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
    Node  temp= new Node(k);
    temp.next=head;
    head=temp;
    return head;
}

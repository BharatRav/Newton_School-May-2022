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

public static Node Insertion(Node head, int K){
    Node temp=new Node(K);
    Node curr=head;
    if(head.next==null){
        head=temp;
        return head;
    }
    while(curr.next!=head){
        curr=curr.next;
    }
    curr.next=temp;
    temp.next=head;  
    return head;
}

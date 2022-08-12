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
public static Node deleteElement(Node head,int k) {
    Node Dummy=new Node(-1);
    Dummy.next=head;
    Node p1=Dummy;
    Node p2=Dummy;
    for(int i=0;i<k;i++){
        p1=p1.next;
    }
    while(p1.next!=null){
        p1=p1.next;
        p2=p2.next;
    }
    p2.next=p2.next.next;
    if(p2.next!=null)
        p2.next.prev=p2;
    return Dummy.next;
}

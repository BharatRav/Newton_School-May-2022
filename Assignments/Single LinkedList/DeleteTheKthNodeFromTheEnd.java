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

public static Node deleteElement(Node head,int k) {
    Node bharat=new Node(1);
    bharat.next=head;
    Node p1=bharat;
    Node p2=bharat;
    for(int i=0;i<=k-1;i++){
        p1=p1.next;
    }
    while(p1.next!=null){
        p1=p1.next;
        p2=p2.next;
    }
    p2.next=p2.next.next;
    return bharat.next;
}

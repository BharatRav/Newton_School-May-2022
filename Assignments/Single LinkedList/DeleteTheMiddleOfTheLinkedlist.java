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

public static Node deleteMiddleElement(Node head) {
		Node temp=head;
    if(head.next==null){        //in case there is only one node
        head.val=-1;
        return head;
    }
    Node s=head;
    Node last=head;
    while(last!=null && last.next!=null){       //using rabbit and turtle aproach hehe
        temp=s;
        s=s.next;
        last=last.next.next;
    }
    temp.next=temp.next.next;
    return head;
    }

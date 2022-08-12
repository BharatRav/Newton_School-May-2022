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

public static int check(Node head) {
    Node curr= head;
    while(curr.next!=head && curr.next!=null){
        curr=curr.next;
        if(curr.next==head)
        return 1;
    }
    return 0;
    
}

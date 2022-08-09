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

public static void deleteNode(Node D) {
    if(D==null) return;
    else{
        Node prev=D;
        //left shifting from given node
        while(D.next!=null){
            D.val=D.next.val;
            prev=D;
            D=D.next;
            
        }
        prev.next=null;
    }
}

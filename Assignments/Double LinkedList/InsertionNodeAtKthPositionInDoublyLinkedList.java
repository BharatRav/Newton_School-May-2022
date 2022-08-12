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


public static Node insertnew(Node head,int K, int P) {      
    Node temp=new Node(K);
    Node curr=head;
    if(P==1){
        temp.next=head;
        head.prev=temp;
        head=temp;
    }else{
        for(int i=2;i<=P-1;i++){
            curr=curr.next;
        }
        temp.next=curr.next;
        temp.prev=curr;
        curr.next=temp;
        if(temp.next!=null){
            temp.next.prev=temp;
        }
    }
    return head;
}

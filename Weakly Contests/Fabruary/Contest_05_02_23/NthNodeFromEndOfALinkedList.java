/*
// information about the class Node
class Node
{
    int data;
    Node next;
    Node(int d) 
    {
        data = d; 
        next = null;
    }
}
*/
static int getNthFromLast(Node head, int n){
    // Your code here
    Node dummy = new Node(-1);
    dummy.next=head;
    
    Node first= dummy;
    Node second = dummy;

    for(int i=0;i<n ;i++) {
        second =second.next;
    }

    while(second!=null) {
        first=first.next;
        second=second.next;
    }

    return first.data;
}

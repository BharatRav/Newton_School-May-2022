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

 Node top = null;
 //Node head=null; // we have to consider head as top
public void push(int x){
    Node temp=new Node(x);
    temp.next=top;
    top=temp;
}

public void pop(){
    if(top!=null) top=top.next;
}

public void top(){
    if(top==null)System.out.println(0);
    else System.out.println(top.val);
}

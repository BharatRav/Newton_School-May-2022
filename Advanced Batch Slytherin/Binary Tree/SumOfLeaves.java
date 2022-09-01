/*
 class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
public static int sumOfLeaf(Node root)
 {
    int sum=0;
    
    if(root==null){                   //#bharat
        return sum;
    }

    Queue<Node> qu=new LinkedList<>();
    qu.offer(root);
    while(!qu.isEmpty()){
        Node temp=qu.poll();
        if(temp.left==null && temp.right==null){
            sum+=temp.data;
        }else{
            if(temp.left!=null){
                qu.offer(temp.left);
            }
            if(temp.right!=null){
                qu.offer(temp.right);
            }
        }
    }
    return sum;
 }

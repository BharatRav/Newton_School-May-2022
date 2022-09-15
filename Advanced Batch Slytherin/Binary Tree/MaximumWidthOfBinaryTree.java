/*
// Information about the class Node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
static int getMaxWidth(Node root)
{
    if(root==null){
        return 0;
    }		
    Queue<Node> qu= new LinkedList<>();
    qu.offer(root);
    int resultSize=0;
    while(!qu.isEmpty()){
        int currentSize=qu.size();
        
        for(int i=0;i<currentSize;i++){
            Node temp=qu.poll();
            if(temp.left!=null){
                qu.offer(temp.left);
            }
            if(temp.right!=null){
                qu.offer(temp.right);
            }
        }
        resultSize=Math.max(resultSize,currentSize);
    }
    return resultSize;
}

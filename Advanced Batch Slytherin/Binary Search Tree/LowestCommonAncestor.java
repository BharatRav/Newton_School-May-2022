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
static Node LCA(Node node, int n1, int n2) 
{
   while (node != null) {
            // If both n1 and n2 are smaller
            // than node, then LCA lies in left
            if (node.data > n1 && node.data > n2)
                node = node.left;
 
            // If both n1 and n2 are greater
            // than node, then LCA lies in right
            else if (node.data < n1 && node.data < n2)
                node = node.right;
 
            else
                break;
        }
        return node;      
}

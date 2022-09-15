/*
// Information about the class Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

*/
static int Diameter=0;
private static int getHeight(Node currentNode){
    int height=0;
    if(currentNode!=null){
        int leftHeight=getHeight(currentNode.left);
        int rightHeight=getHeight(currentNode.right);

        height=Math.max(leftHeight,rightHeight)+1;

        Diameter=Math.max(Diameter,leftHeight+rightHeight+1);
    }
    return height;
}
public static int getDiameter(Node root) 
{
    Diameter=0;
    getHeight(root);       
    return Diameter;
 }

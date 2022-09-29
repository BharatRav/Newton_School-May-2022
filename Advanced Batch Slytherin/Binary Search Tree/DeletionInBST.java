/*
// Information about the class
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
private static int inorderSuccessor(Node currentNode) {
    int minimumValue=currentNode.data;

    while(currentNode.left!=null){
        minimumValue=currentNode.left.data;
        currentNode=currentNode.left;
    }
    return minimumValue;
}
public static Node deleteInBST(Node currentNode, int value)   //root <-> currentNode
{
    if(currentNode==null) {
        return null;
    }
    if(value<currentNode.data) {
        currentNode.left=deleteInBST(currentNode.left,value);
    } else if(value>currentNode.data) {
        currentNode.right = deleteInBST(currentNode.right,value);
    } else {
        if(currentNode.left==null) {
            return currentNode.right;
        }
        if(currentNode.right==null) {
            return currentNode.left;
        }
        int minimumValue=inorderSuccessor(currentNode.right);
        currentNode.data=minimumValue;

        currentNode.right=deleteInBST(currentNode.right,minimumValue);  //here i can put currentNode.data at place 
                                                                        // of minimumValue
    }
    return currentNode;
}

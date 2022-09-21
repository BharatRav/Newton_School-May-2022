/*
class Node
{
    int data;
    Node left, right;
    Node(int data)
   {
      this.data = data;
      this.left = this.right = null;
   }
}
*/

static int getHeight(Node node) 
{
   if(node==null){
      return 0;
   }

   int leftChild=getHeight(node.left);
   int rightChild=getHeight(node.right);

   return(Math.max(leftChild,rightChild)+1);
}

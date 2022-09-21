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
static int count;
static int countSubtreesWithSumX(Node root, int x)
{
    count=0;
   helper(root,x);

   return count;      
}
private static int helper(Node root,int x){
    if(root==null){
        return 0;
    }
    int leftSum=helper(root.left,x);
    int rightSum=helper(root.right,x);
    int sum=leftSum+rightSum+root.data;
    if(sum==x){
        count++;
    }
    return sum;
}

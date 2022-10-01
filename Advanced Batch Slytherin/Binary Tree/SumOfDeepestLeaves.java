/*
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
static int deepestLeavesSum(Node root)
{
   int sum=0;
   if(root==null) {
       return sum;
   }

    Queue<Node> qu = new LinkedList<>();
    qu.add(root);
    qu.add(null);

    int currLevelSum=0;

    while(!qu.isEmpty()) {
        Node temp = qu.poll();
        if(temp!=null) {

            if(temp.left==null && temp.right==null) {
                currLevelSum+=temp.data;
            }

            if(temp.left!=null) {
                qu.add(temp.left);
            }
            if(temp.right!=null) {
                qu.add(temp.right);
            }
        } else {

            sum=currLevelSum;
            currLevelSum=0;
            if(!qu.isEmpty()) {
                qu.add(null);
            }
        }
    }

   return sum;
   
}

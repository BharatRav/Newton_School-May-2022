/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
  static void levelOrder(Node root){
      if(root==null){
        return;
      }

      Queue<Node> qu=new LinkedList<>();
      qu.offer(root);
      
      while(!qu.isEmpty()){
        Node temp=qu.poll();
        System.out.print(temp.data+" ");
        if(temp.left!=null){
          qu.offer(temp.left);
        }
        if(temp.right!=null){
          qu.offer(temp.right);
        }
      }
    }

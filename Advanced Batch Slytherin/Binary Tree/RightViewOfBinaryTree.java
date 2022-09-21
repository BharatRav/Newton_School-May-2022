/*
//Information about the class Node
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
static void printRightView(Node node) 
{
    if (node == null) {
            return;
        }
  
        Queue<Node> q = new LinkedList<>();
        q.add(node);
  
        while (!q.isEmpty()) {
  
            int n = q.size();
  
            for (int i = 0; i < n; i++) {
                Node curr = q.peek();
                q.remove();
  
                if (i == n - 1) {
                    System.out.print(curr.data+" ");
                    
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
}

static void printRightVie0w(Node node) 
{// my method
        if(node==null){
            return;
        } 
        Queue<Node> qu= new LinkedList<>();
        qu.add(node);
        qu.add(null);
        System.out.print(qu.peek().data+" ");
        while(!qu.isEmpty()){
            Node temp=qu.poll();
            if(temp!=null){
                if(temp.right!=null){
                    qu.add(temp.right);
                }
                if(temp.left!=null){
                    qu.add(temp.left);
                }
            }else{
                if(!qu.isEmpty()){
                    qu.add(null);
                    System.out.print(qu.peek().data+" ");
                }
                
            }
        }
}

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    private static void DepthPrint(Node rootNode,int D){
        if(rootNode==null){
            while(D-->0){
                System.out.print(0+" ");
            }
            return;
        }
        Queue<Node> qu= new LinkedList<>();
        int countCompleted=0;
        qu.add(rootNode);
        while(!qu.isEmpty()){
            System.out.print(qu.size()+" ");
            int limit=qu.size();
            countCompleted++;
            for(int i=0;i<limit;i++){
                Node temp=qu.poll();
                if(temp.left!=null){
                    qu.offer(temp.left);
                }
                if(temp.right!=null){
                    qu.offer(temp.right);
                }
            }
        }
        while(countCompleted++<D){
            System.out.print(0+" ");
        }
    }
    private static void inorder(Node currentNode){
        if(currentNode==null){
            return ;
        }
        inorder(currentNode.left);
        System.out.print(currentNode.data+" ");
        inorder(currentNode.right);
    }
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Node arr[]=new Node[n+1];
    for (int i = 1; i <= n; i++) {
      arr[i]=new Node(i);
    }
   //sachin method to insert in tree
      for (int i = 1; i <= n; i++) {
      int l=sc.nextInt();
      int r=sc.nextInt();
      arr[i].left=(l==-1)?null:arr[l]; 
      arr[i].right=(r==-1)?null:arr[r];
    }
        //inorder(hm.get(1));
        //System.out.println();
        DepthPrint(arr[1],n);
    }
}

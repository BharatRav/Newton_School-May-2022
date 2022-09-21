import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();    //input line 1

        Map<Integer,Node> hm= new HashMap<>();
        for(int i=1;i<=n;i++){
            hm.put(i,new Node(sc.nextInt()));      //input line 2
        }
        
        //input line 3
        int rootNodeIndex=sc.nextInt();


        //taking next n lines containing left and right
        Node currentNode;
        for(int i=1;i<=n;i++){      
            int l=sc.nextInt();
            int r=sc.nextInt();
            
            //we know all nodes hav already exist in HashMap
            currentNode=hm.get(i);
            if(l!=0){
                currentNode.left=hm.get(l);
            }
            if(r!=0){
                currentNode.right=hm.get(r);
            }
        }

        //calling Inorder to check is it construct or not
        //Inorder(hm.get(rootNodeIndex));

        System.out.print(IsBST(hm.get(rootNodeIndex))?"YES":"NO" );
    }

    private static boolean IsBST(Node root){
        boolean result = isValidBSTHelper(root, null, null);
        return result;
    }

    private  static boolean isValidBSTHelper(Node currentNode, Integer min, Integer max) {
        boolean leftStatus = true;
        boolean rightStatus = true;

        if(currentNode != null) {
            if(min != null && currentNode.data <= min) {
                return false;
            }

            if(max != null && currentNode.data >= max) {
                return false;
            }

            leftStatus = isValidBSTHelper(currentNode.left, min, currentNode.data);
            rightStatus = isValidBSTHelper(currentNode.right, currentNode.data, max);
        }

        return (leftStatus && rightStatus);
    }

    // private static void Inorder(Node currentNode){
    //     if(currentNode==null){
    //         return ;
    //     }
    //     Inorder(currentNode.left);
    //     System.out.print(currentNode.data+" ");
    //     Inorder(currentNode.right);
    // }

}

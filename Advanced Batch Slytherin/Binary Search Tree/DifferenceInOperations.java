import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    Node root;

    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data=data;
        }
    }

    private Node insertData(Node currentNode, int data) {
        if(currentNode==null) {
            return new Node(data);
        }

        if(data<currentNode.data) {
            currentNode.left=insertData(currentNode.left,data);
        } else {
            currentNode.right=insertData(currentNode.right,data);
        }
        return currentNode;
    }

    private int getMaximumInBST(Node currentNode) {
        if(currentNode==null) {
            return 0;
        }
        int maximum=currentNode.data;

        while(currentNode.right!=null) {
            maximum=currentNode.right.data;
            currentNode=currentNode.right;
        }

        return maximum;
    }

    private int getMinimumInBST(Node currentNode) {
        if(currentNode==null) {
            return 0;
        }
        int minimum=currentNode.data;

        while(currentNode.left!=null) {
            minimum=currentNode.left.data;
            currentNode=currentNode.left;
        }

        return minimum;
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Main main=new Main();

        for(int i=0;i<n;i++) {
            int data= sc.nextInt();

            main.root=main.insertData(main.root, data);
        }
        
        int minimum=main.getMinimumInBST(main.root);
        int maximum=main.getMaximumInBST(main.root);
        
        System.out.println((minimum*maximum)-(minimum+maximum));
    }
}

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

    private Node insertNode(Node currentNode,int nodeValue) {
        if(currentNode==null) {
            return new Node(nodeValue);
        }

        if(nodeValue<=currentNode.data) {
            currentNode.left=insertNode(currentNode.left,nodeValue);
        } else {
            currentNode.right=insertNode(currentNode.right,nodeValue);
        }
        return currentNode;
    }

    private int countNodes(Node currentNode, int low, int high) {
        if(currentNode==null) {
            return 0;
        }

        if(currentNode.data<low) {
            return countNodes(currentNode.right, low,high);
        }
        if(currentNode.data>high) {
            return countNodes(currentNode.left, low,high);
        }
        return (1+countNodes(currentNode.left,low,high)+
                    countNodes(currentNode.right,low,high));
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        int n=sc.nextInt();
        Main main= new Main();
        for(int i=0;i<n;i++) {
            int nodeValue=sc.nextInt();
            main.root=main.insertNode(main.root,nodeValue);
        }
        int count=main.countNodes(main.root,low,high);
        System.out.println(count);
    }
}

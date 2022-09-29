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

    private Node insert(Node currentNode, int value) {
        if(currentNode==null) {
            return new Node(value);
        }

        if(value<currentNode.data) {
            currentNode.left=insert(currentNode.left,value);
        } else {
            currentNode.right= insert(currentNode.right,value);
        }
        return currentNode;
    }

    private int getceilofBST(Node currentNode,int x) {
        if(currentNode==null) {
            return -1;
        }

        if(currentNode.data==x) {
            return currentNode.data;
        }
        //because i want ceil so first check right 
        if(currentNode.data<x) {
            return getceilofBST(currentNode.right,x);
        }
        //if im at line 42 it means currentNodedata is greater than x
        //so now check for left also then take maximum of them 
        int ceilInLeftSubtree= getceilofBST(currentNode.left,x);
        return (Math.max(currentNode.data,ceilInLeftSubtree));
    }

    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Main main=new Main();

        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            main.root=main.insert(main.root,value);
        }
        int x=sc.nextInt();
        int ceil=main.getceilofBST(main.root,x);
        System.out.println(ceil);
    }
}

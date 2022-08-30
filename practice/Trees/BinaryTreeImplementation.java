package Trees.BinaryTree;

import java.util.Scanner;

public class BinaryTreeImplementation {
    static Scanner sc=null;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        //BinaryTreeImplementation bt=new BinaryTreeImplementation();
        Node root=createTree();
        System.out.println();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }
    static Node createTree(){
        Node root;
        System.out.println("Enter data: ");
        int data=sc.nextInt();

        if(data==-1) return null;       //breaking point for recursion #bharat

        root= new Node(data);

        System.out.println("Enter left for "+data);
        root.left=createTree();

        System.out.println("Enter right for "+data);
        root.right=createTree();

        return root;
    }
    static void inOrder(Node root){     //LNR  left root right
        if(root==null) return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root){     //NLR  root left right
        if(root==null) return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){     //LRN  left right root
        if(root==null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    static class Node{      //if I take class inside a class then make class static
                            // if not then no need of static class outside the class
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.data=data;
        }
    }

}


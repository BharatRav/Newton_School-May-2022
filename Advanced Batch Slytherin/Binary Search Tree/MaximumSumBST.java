import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    TreeNode root;
    int MaximumSum=0;
    private static class TreeNode {
        int data;
        TreeNode  leftChild;
        TreeNode rightChild;
        TreeNode(int data) {
            this.data=data;
        }
        TreeNode(int data, TreeNode leftChild,  TreeNode rightChild) {
            this.data=data;
            this.leftChild=leftChild;
            this.rightChild=rightChild;
        }
    }
    static class NodeWrapper {
        TreeNode node;
        boolean isValid;
        int minimum;
        int maximum;
        int sum;
        NodeWrapper(TreeNode node) {
            this.node=node;
            isValid=true;
            this.minimum=node.data;
            this.maximum=node.data;
            this.sum=node.data;
        }
    }

    private NodeWrapper MaximumSumBSTHelper(TreeNode currentNode) {
        if(currentNode==null) {
            return null;
        }

        NodeWrapper leftSubTree=MaximumSumBSTHelper(currentNode.leftChild);
        NodeWrapper rightSubTree=MaximumSumBSTHelper(currentNode.rightChild);

        NodeWrapper currentNodeWrapper=new NodeWrapper(currentNode);

        if(leftSubTree!=null) {
            currentNodeWrapper.isValid=leftSubTree.isValid && currentNode.data>leftSubTree.maximum;
            currentNodeWrapper.minimum=Math.min(leftSubTree.minimum,currentNode.data);
            currentNodeWrapper.maximum=Math.max(leftSubTree.maximum,currentNode.data);
            currentNodeWrapper.sum+=leftSubTree.sum;
        }

        if(rightSubTree!=null) {
            currentNodeWrapper.isValid= currentNodeWrapper.isValid && (rightSubTree.isValid && currentNode.data<rightSubTree.minimum);
            currentNodeWrapper.minimum=Math.min(currentNodeWrapper.minimum,rightSubTree.minimum);
            currentNodeWrapper.maximum=Math.max(currentNodeWrapper.maximum,rightSubTree.maximum);
            currentNodeWrapper.sum+=rightSubTree.sum;
        }

        if(currentNodeWrapper.isValid) {
            MaximumSum=Math.max(MaximumSum,currentNodeWrapper.sum);
        }

        return currentNodeWrapper;
    }

    private int MaximumSumBST(TreeNode root) {
        if(root==null) {
            return MaximumSum;
        }
        MaximumSumBSTHelper(root);
        return MaximumSum;
    }

    private TreeNode insert(TreeNode currentNode, int data) {
        if(currentNode==null) {
            return new TreeNode(data);
        }
        
        if(data<currentNode.data) {
            currentNode.leftChild= insert(currentNode.leftChild,data);
        }
        
        if(data>currentNode.data) {
            currentNode.rightChild= insert(currentNode.rightChild,data);
        }
        return currentNode;
    }

    private void buildTree(int[] arr, int count) {
        if(count==0) {
            root=new TreeNode(arr[count]);
            count++;
        }

        int n=arr.length;

        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);

        while(count<n-1) {
            TreeNode temp = qu.poll();

            if(count <= n-1) {
                if(arr[count]!=-1) {
                    TreeNode newNode= new TreeNode(arr[count]);
                    temp.leftChild=newNode;
                    qu.add(temp.leftChild);
                }
                count++;
            }

            if(count <= n-1) {
                if(arr[count]!=-1) {
                    TreeNode newNode= new TreeNode(arr[count]);
                    temp.rightChild=newNode;
                    qu.add(temp.rightChild);
                }
                count++;
            }
        }

    }

    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        Main tree=new Main();
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++) {
           arr[i] = sc.nextInt();
        }
        tree.buildTree(arr,0);

        tree.MaximumSumBST(tree.root);

        System.out.println(tree.MaximumSum);
    }
}

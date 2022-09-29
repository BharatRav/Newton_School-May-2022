/*
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
*/
private static int inorderSuccessor(TreeNode root) {
    int MinimumValue=root.val;

    while(root.left!=null) {
        MinimumValue=root.left.val;
        root=root.left;
    }
    return MinimumValue;
}

public static TreeNode deleteNode(TreeNode root, int key) {
    if(root==null) {
        return null;
    }
    
    if(key<root.val) {
        root.left=deleteNode(root.left,key);
    } else if (key>root.val) {
        root.right=deleteNode(root.right,key);
    } else {
        //it means currentNode is the node which i have to delete
        if(root.left==null) {
            return root.right;
        }
        if(root.right==null) {
            return root.left;
        }
        
        int minimumSuccesor=inorderSuccessor(root.right);
        root.val=minimumSuccesor;
        root.right=deleteNode(root.right,minimumSuccesor);

        
    }
    return root;
}

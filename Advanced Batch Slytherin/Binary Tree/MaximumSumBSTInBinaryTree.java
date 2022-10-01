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


class Solution {
    static int MaximumSum=0;
    static class NodeWrapper {
        TreeNode node;
        boolean isValid;
        int minimum;
        int maximum;
        int sum;
        NodeWrapper(TreeNode node) {
            this.node=node;
            isValid=true;
            this.minimum=node.val;
            this.maximum=node.val;
            this.sum=node.val;
        }
    }

    private NodeWrapper MaximumSumBSTHelper(TreeNode currentNode) {
        if(currentNode==null) {
            return null;
        }

        NodeWrapper leftSubTree=MaximumSumBSTHelper(currentNode.left);
        NodeWrapper rightSubTree=MaximumSumBSTHelper(currentNode.right);

        NodeWrapper currentNodeWrapper=new NodeWrapper(currentNode);

        if(leftSubTree!=null) {
            currentNodeWrapper.isValid=leftSubTree.isValid && currentNode.val>leftSubTree.maximum;
            currentNodeWrapper.minimum=Math.min(leftSubTree.minimum,currentNode.val);
            currentNodeWrapper.maximum=Math.max(leftSubTree.maximum,currentNode.val);
            currentNodeWrapper.sum+=leftSubTree.sum;
        }

        if(rightSubTree!=null) {
            currentNodeWrapper.isValid= currentNodeWrapper.isValid && (rightSubTree.isValid && currentNode.val<rightSubTree.minimum);
            currentNodeWrapper.minimum=Math.min(currentNodeWrapper.minimum,rightSubTree.minimum);
            currentNodeWrapper.maximum=Math.max(currentNodeWrapper.maximum,rightSubTree.maximum);
            currentNodeWrapper.sum+=rightSubTree.sum;
        }

        if(currentNodeWrapper.isValid) {
            MaximumSum=Math.max(MaximumSum,currentNodeWrapper.sum);
        }

        return currentNodeWrapper;
    }

    public int maxSumBST(TreeNode root) {
        if(root==null) {
            return MaximumSum;
        }
        MaximumSum=0;
        MaximumSumBSTHelper(root);
        return MaximumSum;
    }
}

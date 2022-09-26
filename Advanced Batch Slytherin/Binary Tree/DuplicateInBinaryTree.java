// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }

class Solution {
  
   private List<Integer> list=new ArrayList<>();
   public boolean duplicate(TreeNode root){
      if(root!=null){
         if(list.contains(root.val)){
            return true;
         }else{
            list.add(root.val);
            return duplicate(root.left) || duplicate(root.right);
         }
      }
      return false;
   }
  
}

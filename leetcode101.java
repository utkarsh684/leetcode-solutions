/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class leetcode101 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return checkSymmetry(root.left,root.right);
    }
    public boolean checkSymmetry(TreeNode Left,TreeNode Right){
        if(Left==null && Right==null){
            return true;
        }

        if(Left!=null && Right !=null && Left.val==Right.val){
            return checkSymmetry(Left.left,Right.right) && checkSymmetry(Left.right,Right.left);
        }
        return false;
    }
}

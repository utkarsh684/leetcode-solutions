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
class leetcode110 {
    public boolean isBalanced(TreeNode root) {
        return checkBalanced(root)!=-1;
    }

    private int checkBalanced(TreeNode root){
        if(root==null){
            return 0;
        }

        int lh=checkBalanced(root.left);
        int rh=checkBalanced(root.right);
        if(lh==-1 || rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        return 1+Math.max(lh,rh);
    }
}

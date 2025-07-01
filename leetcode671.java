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
class leetcode671 {
    long small=Long.MAX_VALUE;
    long secSmall=Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        
        find(root);
        return secSmall==Long.MAX_VALUE?-1:(int)secSmall;
    }
    private void find(TreeNode root){
        if(root==null){
            return ;
        }
        if(root.val<small){
            secSmall=small;
            small=root.val;
        }
        else if(root.val>small && root.val<secSmall){
            secSmall=root.val;
        }

        if(root.left!=null) find(root.left);
        if(root.right!=null) find(root.right);
        
    }
}

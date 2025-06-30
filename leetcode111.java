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
class leetcode111 {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        if(root.right==null && root.left==null){
            return 1;
        }

        int lh= root.left==null ? Integer.MAX_VALUE:minDepth(root.left);
        int rh= root.right==null ? Integer.MAX_VALUE:minDepth(root.right);

        return 1+Math.min(lh,rh);
    }
}

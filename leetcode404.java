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
class leetcode404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)){
            return 0;
        }
        return sum(root);
    }
    private int  sum(TreeNode temp){
        if(temp==null){
            return 0;
        }
        int s=0;
        if(temp.left!=null && temp.left.left==null && temp.left.right==null){
            s+=temp.left.val;
        }

        s+=sum(temp.left);
        s+=sum(temp.right);
        return s;
    }
}

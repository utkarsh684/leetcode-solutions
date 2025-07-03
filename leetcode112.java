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
class leetcode112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        return hasPathSums(root,targetSum,0);
    }
    private boolean hasPathSums(TreeNode root,int targetSum,int sum){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            sum+=root.val;
            if(sum==targetSum){
                return true;
            }
            else{
                sum-=root.val;
            }
        }
        else{
            sum+=root.val;
        }
        return hasPathSums(root.left,targetSum,sum) || hasPathSums(root.right,targetSum,sum);
    }
}

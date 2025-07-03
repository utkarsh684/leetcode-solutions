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
class leetcode2331 {
    public boolean evaluateTree(TreeNode root) {
        if(root.left==null && root.right==null){
            return root.val!=0;
        }

        boolean leftResult=evaluateTree(root.left);
        boolean rightResult=evaluateTree(root.right);
        boolean result;

        if(root.val==2){
            result=leftResult | rightResult;
        }
        else{
            result=leftResult & rightResult;
        }

        return result;
    }
}
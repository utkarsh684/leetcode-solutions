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
class leetcode965 {
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return false;
        }
        Queue<TreeNode> queue =new LinkedList<>();
        queue.add(root);
        int v=root.val;
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            if(temp.val!=v){
                return false;
            }

            if(temp.left!=null) queue.add(temp.left);
            if(temp.right!=null) queue.add(temp.right);
        }

        return true;
    }
}

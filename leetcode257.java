/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class leetcode257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null)
            return list;
        binaryTreePath(root, "", list);
        return list;
    }

    private void binaryTreePath(TreeNode temp, String str, List<String> ls) {
        if (temp == null) {
            return;
        }

        str = str + Integer.toString(temp.val);
        if (temp.left == null && temp.right == null) {
            ls.add(str);
            return;
        }

        str += "->";
        binaryTreePath(temp.left, str, ls);
        binaryTreePath(temp.right, str, ls);

    }
}
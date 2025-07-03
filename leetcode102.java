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
class leetcode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue =new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        queue.add(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> ls=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=queue.poll();
                ls.add(temp.val);

                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
            list.add(ls);
        }
        return list;
    }
}

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
class leetcode872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> ls1=new ArrayList<>();
        List<Integer> ls2=new ArrayList<>();
        List<Integer> list1=checkRoot1(root1,ls1);
        List<Integer> list2=checkRoot2(root2,ls2);

        return list1.equals(list2);
    }
    private List<Integer> checkRoot1(TreeNode node,List<Integer> list){
        if(node.left==null && node.right==null){
            list.add(node.val);
            return list;
        }

        if(node.left!=null) checkRoot1(node.left,list);
        if(node.right!=null) checkRoot1(node.right,list);

        return list;
    }
    private List<Integer> checkRoot2(TreeNode node,List<Integer> list){
        if(node.left==null && node.right==null){
            list.add(node.val);
            return list;
        }

        if(node.left!=null) checkRoot2(node.left,list);
        if(node.right!=null) checkRoot2(node.right,list);

        return list;
    }
}

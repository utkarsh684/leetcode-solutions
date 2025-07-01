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
class leetcode1022 {
    int sum=0;
    public int sumRootToLeaf(TreeNode root) {
         find(root,"");
         return sum;
    }

    private void find(TreeNode root, String str){
        if(root==null){
            return ;
        }
        str=str+root.val;
        if(root.left==null && root.right==null){
            
            sum+=convert(str);
            return;
        }

        if(root.left!=null) find(root.left,str);
        if(root.right!=null) find(root.right,str);
        
    }

    private int convert(String str){
        int s=0;
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            s+=(str.charAt(i)-'0')*Math.pow(2,count++);
        }
        return s;
    }
}

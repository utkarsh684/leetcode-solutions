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
class leetcode501 {
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> map=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            map.put(curr.val,map.getOrDefault(curr.val,0)+1);

            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right); 
        }
        return result(map);
    }

    private int[] result(Map<Integer,Integer> map){
        
        List<Integer> ls=new ArrayList<>();
        int count=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>count){
                ls.clear();
                ls.add(entry.getKey());
                count=entry.getValue();
            }
            else if(entry.getValue()==count){
                ls.add(entry.getKey());
            }
        }
        int arr[]=new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            arr[i]=ls.get(i);
        }

        return arr;
    }
}

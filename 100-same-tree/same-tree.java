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
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue=new LinkedList<>();

        queue.add(p);
        queue.add(q);
        while(!queue.isEmpty()){
            TreeNode fn=queue.remove();
            TreeNode sn=queue.remove();

            if(fn==null && sn==null){
                continue;
            }

            if(fn==null || sn==null || fn.val!=sn.val){
                return false;

            }

            queue.add(fn.left);
            queue.add(sn.left);
            queue.add(fn.right);
            queue.add(sn.right);
        }
        return true;
    }
}
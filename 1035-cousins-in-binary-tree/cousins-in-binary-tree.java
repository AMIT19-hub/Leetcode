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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx=findNode(root,x);
        TreeNode yy=findNode(root,y);

        return(
            (level(root,xx,0)==level(root,yy,0)) && (!isSibiling(root,xx,yy))
        );
        


    }

    public TreeNode findNode(TreeNode node, int val) {
        if (node == null) {
            return null;
        }

        if (node.val == val) {
            return node;
        }

        TreeNode n = findNode(node.left, val);
        if (n != null) {
            return n;
        }
        return findNode(node.right, val);
    }

    public int level(TreeNode curr, TreeNode node, int level) {
        if (curr == null) {
            return -1;
        }
        if (curr.val == node.val) {
            return level;
        }
        int leftVal = level(curr.left, node, level + 1);
        if (leftVal != -1) {
            return leftVal;
        }
        return level(curr.right, node, level + 1);
    }

    public boolean isSibiling(TreeNode node, TreeNode left,TreeNode right){

        if(node==null){
            return false;
        }
        return(
            (node.left==left && node.right==right) ||
            (node.left==right && node.right==left) ||
            (isSibiling(node.left,left,right)) ||
            (isSibiling(node.right,left,right))
        );
    }
}
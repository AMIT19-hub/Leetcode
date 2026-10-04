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
    public boolean isSymmetric(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int len = queue.size();
            int[] arr = new int[len];
            int j = 0;
            for (int i = 0; i < len; i++) {
                TreeNode curr = queue.remove();
                if (curr == null) {
                    arr[j++] = 101;

                } else {
                    arr[j++] = curr.val;
                }
                // add currNode childs to queue
                if (curr != null) {
                    queue.add(curr.left);
                    queue.add(curr.right);
                }
                
                
            }

            int l = 0;
            int r = arr.length - 1;
            while (l < r) {
                if (arr[l] != arr[r]) {
                    return false;
                }
                l++;
                r--;
            }

        }
        return true;
    }
}
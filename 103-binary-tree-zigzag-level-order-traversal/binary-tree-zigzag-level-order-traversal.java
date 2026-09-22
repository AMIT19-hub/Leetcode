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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        boolean reverse=false;
        while (!queue.isEmpty()) {

            int len = queue.size();
            List<Integer> innerList = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < len; i++) {
                TreeNode currNode = queue.poll();
                if (reverse) {
                    stack.push(currNode.val);
                } else {
                    innerList.add(currNode.val);
                }
                if (currNode.left != null) {
                    queue.offer(currNode.left);
                }
                if (currNode.right != null) {
                    queue.offer(currNode.right);
                }

            }
            while (!stack.isEmpty()) {
                innerList.add(stack.pop());
            }
            reverse=!reverse;

            list.add(innerList);

        }
        return list;
    }
}
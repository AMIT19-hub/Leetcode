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
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int len = queue.size();
            double sum = 0;
            for (int i = 0; i < len; i++) {
                TreeNode currIdx = queue.poll();
                sum += currIdx.val;
                if (currIdx.left != null) {
                    queue.offer(currIdx.left);
                }
                if (currIdx.right != null) {
                    queue.offer(currIdx.right);
                }
            }
            double avg = (double) sum / len;
            list.add(avg);
        }
        return list;
    }
}
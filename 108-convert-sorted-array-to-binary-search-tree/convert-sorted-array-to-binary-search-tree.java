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
    TreeNode root;

    public TreeNode sortedArrayToBST(int[] nums) {

        populateSorted(nums, 0, nums.length);
        return root;
    }

    public void populateSorted(int[] nums, int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = (s + e) / 2;
        insert(nums[mid]);
        populateSorted(nums, s, mid);
        populateSorted(nums, mid + 1, e);

    }

    public void insert(int val) {
        root = insert(root, val);
    }

    public TreeNode insert(TreeNode node, int val) {
        if (node == null) {
            return node = new TreeNode(val);

        }
        if (val < node.val) {
            node.left = insert(node.left, val);
        }
        if (val > node.val) {
            node.right = insert(node.right, val);
        }
        return node;
    }
}
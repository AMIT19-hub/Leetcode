/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {

        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        search(root, list);
        return list;
    }

    public void search(Node node, List list) {
        if (node == null) {
            return;
        }
        for (Node curr : node.children) {
            list.add(curr.val);
            search(curr, list);

        }
    }
}
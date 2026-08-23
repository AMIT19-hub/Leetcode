/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        // calculate length and lastnode of list
        int length = 0;
        ListNode temp = head;
        ListNode lastNode = null;
        while (temp != null) {
            lastNode = temp;
            temp = temp.next;
            length += 1;
        }

        // rotate list 
         k = k % length;
        ListNode curr = head;
        for (int i = 0; i < length - k - 1; i++) {
            curr = curr.next;
        }
        lastNode.next = head;
        head = curr.next;
        curr.next = null;
        return head;
    }
}
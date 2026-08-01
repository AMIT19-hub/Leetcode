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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length += 1;
            temp = temp.next;
        }

        for (int i = 0; i <  length / 2; i++) {
            head = head.next;
        }

        return head;
    }

}
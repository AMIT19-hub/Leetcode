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

    // optimized way within single pass
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null) {
            slow = slow.next;
            if (fast.next.next == null) {
                return slow;
            }
            fast = fast.next.next;
        }
        return slow;
    }

    // this is the long way we have to run two times
    public ListNode way2(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length += 1;
            temp = temp.next;
        }

        for (int i = 0; i < length / 2; i++) {
            head = head.next;
        }

        return head;
    }

}
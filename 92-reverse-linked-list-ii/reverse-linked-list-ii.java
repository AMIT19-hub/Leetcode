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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // when there is only one node in list
        if (left == right) {
            return head;
        }

        ListNode prev = null;
        ListNode present = head;

        // reach to the node from where we have to reverse
        for (int i = 0; i < left - 1 && present != null; i++) {
            prev = present;
            present = present.next;

        }

        ListNode last = prev;
        ListNode newEnd = present;

        // traverse to the right node and reverse
        ListNode next = present.next;
        for (int i = 0; i < right - left + 1; i++) {
            present.next=prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = present;
        return head;
    }
}
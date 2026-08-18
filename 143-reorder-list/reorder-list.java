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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode hf = head;
        // take midd and reverse the list from mid
        ListNode mid = middleNode(head);
        // hs=headsecond
        ListNode hs = reverseList(mid);

        // merge from both heads
        while (hf != null && hs != null) {

            ListNode temp = hf.next;

            hf.next = hs;
            hf = temp;
            temp = hs.next;

            hs.next = hf;
            hs = temp;
        }
        // setting tail next to null
        if (hf != null) {
            hf.next = null;
        }

    }

    ListNode middleNode(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;
        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
}
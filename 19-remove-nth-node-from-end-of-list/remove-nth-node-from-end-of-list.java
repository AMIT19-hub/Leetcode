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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }

        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count += 1;
            temp = temp.next;
        }

        int deleteIdx = count - n + 1;
        ListNode prev = null;
        ListNode curr = head;
        int i = 1;
        while (curr != null) {
            if (i == deleteIdx && curr != null) {
                if (prev == null) {
                    head = head.next;
                    return head;
                }
                prev.next = curr.next;
            }
            prev = curr;
            curr = curr.next;
            i++;

        }
        return head;
    }
}
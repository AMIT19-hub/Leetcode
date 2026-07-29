/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    // this is the faster than way 1
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        do {
            if (fast == null || fast.next == null)
                return null;
            slow = slow.next;
            fast = fast.next.next;
        } while (slow != fast);
        ListNode temp = head;
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }
        return temp;

    }

// first way of soution
    public ListNode way1(ListNode head) {
        // first check if cycle present or not
        if (isCycle(head)) {

            ListNode temp1 = head;
            ListNode temp2 = head;
            int length = cycleLength(head);
            while (length > 0) {
                temp1 = temp1.next;
                length--;
            }
            while (temp1 != temp2) {

                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            return temp1;
        }
        return null;
    }

    int cycleLength(ListNode node) {
        int count = 0;
        ListNode s = node;
        ListNode f = node;
        do {
            s = s.next;
            f = f.next.next;
        } while (f != s);

        ListNode temp = s;
        do {
            s = s.next;
            count += 1;
        } while (s != temp);
        return count;
    }

    boolean isCycle(ListNode node) {
        ListNode slow = node;
        ListNode fast = node;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }

        return false;
    }
}
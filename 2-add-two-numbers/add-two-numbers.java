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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null || l2==null){
            return null;
        }
        ListNode temp = l1;
        ListNode prev=null;
        int count = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + count;
            if (sum > 9) {
                l1.val = sum % 10;
                count = 1;
            } else {
                l1.val = sum;
                count = 0;
            }
            prev = l1;
            l1 = l1.next;
            l2 = l2.next;

        }

        // If l1 finished first link remaining l2 to l1
        if (l1 == null && l2 != null) {
            prev.next = l2;
            l1 = l2;
        }

        while (l1 != null) {
            int sum = l1.val + count;
            if (sum > 9) {
                l1.val = sum % 10;
                count = 1;
            } else {
                l1.val = sum;
                count = 0;
            }
            prev = l1;
            l1 = l1.next;
        }

        // add count in last
        if (prev != null && count == 1) {
            prev.next = new ListNode(count);
        }

        return temp;
    }
}
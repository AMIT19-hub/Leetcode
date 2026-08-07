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
        if(head==null || head.next==null){
            return head;
        }
        // for making the pointer null that points to mid node
        ListNode prev =null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            prev=slow;
            slow = slow.next;

            fast = fast.next.next;
        }
        prev.next=null;
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
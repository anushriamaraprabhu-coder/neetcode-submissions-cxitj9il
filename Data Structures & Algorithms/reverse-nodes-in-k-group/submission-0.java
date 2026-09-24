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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupprev = dummy;

        while (true) {
            ListNode kth = getkth(groupprev, k);

            if (kth == null) {
                break;
            }

            ListNode nextgroup = kth.next;

            ListNode prev = nextgroup;
            ListNode current = groupprev.next;
            ListNode oldstart = groupprev.next;

            while (current != nextgroup) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            groupprev.next = prev;
            groupprev = oldstart;
        }

        return dummy.next;
    }

    private ListNode getkth(ListNode current, int k) {
        while (current != null && k > 0) {
            current = current.next;
            k--;
        }

        return current;
    }
}

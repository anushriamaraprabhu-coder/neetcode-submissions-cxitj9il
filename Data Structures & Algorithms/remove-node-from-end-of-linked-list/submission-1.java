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

        ListNode dummy=new ListNode(-1);
        dummy.next=head;

        ListNode firstPointer=dummy;
        ListNode secondPointer=dummy;

        //advance the second pointer n spaces 

        for(int i=0;i<n;i++){
            secondPointer=secondPointer.next;
        }

        //move both the pointers till the second pointer meets null 

        while(secondPointer.next!=null){
            firstPointer=firstPointer.next;
            secondPointer=secondPointer.next;

        }

        //remove the nth node from the list 

        firstPointer.next=firstPointer.next.next;

        return dummy.next;

    }
}

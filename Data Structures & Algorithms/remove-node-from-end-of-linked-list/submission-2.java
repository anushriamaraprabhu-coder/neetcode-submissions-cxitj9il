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

        //advance n spaces 

        for(int i=0;i<n;i++){
            secondPointer=secondPointer.next;
        
        } 

        //move till both the pointer meet 

        while(secondPointer.next!=null){
            firstPointer=firstPointer.next;
            secondPointer=secondPointer.next;
        }

        //remove the element to next of left pointer 

        firstPointer.next=firstPointer.next.next;

        return dummy.next;

    }
}

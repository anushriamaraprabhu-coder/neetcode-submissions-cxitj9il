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

        ListNode slow=head;
        ListNode fast=head;

        //hare and tortoise algorithm 

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }

        //reverse the linked list 

        ListNode prev=null;
        ListNode current=slow.next;
        slow.next=null;

        while(current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        ListNode firstHalf=head;
        ListNode secondHalf=prev;

        while(secondHalf!=null){

            ListNode left=firstHalf.next;
            ListNode right=secondHalf.next;

            firstHalf.next=secondHalf;
            secondHalf.next=left;

            firstHalf=left;
            secondHalf=right;






        }
        
    }
}

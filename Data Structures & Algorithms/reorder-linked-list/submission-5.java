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

        //find the mid point 

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }

        // Reverse the linked list 

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

        // Join the lists 
        ListNode left=firstHalf.next;
        ListNode right=secondHalf.next;

        firstHalf.next=secondHalf;
        secondHalf.next=left;

        firstHalf=left;
        secondHalf=right;


        }







        
    }
}

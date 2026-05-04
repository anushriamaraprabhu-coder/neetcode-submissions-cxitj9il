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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //Time complexity is O(n+m) as we are having lengths of 2 lists 
        //space complexity=O(1) as we are not taking up any extra space 

        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;

        while(list1!=null && list2!=null){

            if(list1.val<=list2.val){
                //add the list1 elements 
                current.next=list1;
                //move the list1 pointer
                list1=list1.next;
            }

            else{

                //add the list 2 elements to the new list
                current.next=list2;
                list2=list2.next;
            }

            current=current.next;
        }

        //add the remaining elements 
        if(list1!=null){current.next=list1;}
        if(list2!=null){current.next=list2;}

        return dummy.next;
        
    }
}
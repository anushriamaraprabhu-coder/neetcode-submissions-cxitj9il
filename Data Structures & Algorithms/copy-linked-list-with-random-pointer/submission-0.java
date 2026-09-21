/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        HashMap<Node,Node>map=new HashMap<>();

        Node current=head;

        while(current!=null){

            Node current1=new Node(current.val);
            map.put(current,current1);
            current=current.next;
        }

        current=head;
        
        while(current!=null){

            map.get(current).next=map.get(current.next);
            map.get(current).random=map.get(current.random);
              current=current.next;
        }

        return map.get(head);
        
    }
}

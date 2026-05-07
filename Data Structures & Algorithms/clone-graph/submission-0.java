/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    //we are given one node of the graph and we need to return the deep copy of the entire connected graph


    public Node cloneGraph(Node node) {

        // case1: if the graph is empty there is nothing to clone.

        if(node==null){return null;}

        //take a hashmap to store the original graph and its clone so that there are no extra cloned nodes that 
        //lead to infinite recursion/stack overflow 

        HashMap<Node,Node>map=new HashMap<>();
        Stack<Node>stack=new Stack<>();

        //start creating the clones 1 by 1
        //1-1' , 2-2', 3-3'....
        Node clone=new Node(node.val);

        //immediately put the cloned node into the map so we dont again create a new clone

        map.put(node,clone);

        //Start the DFS traversal 

        stack.push(node); //push the original node 

        while(!stack.isEmpty()){

            Node currentVertex=stack.pop();

            //now check for all the current neighbours 

            for(Node neighbour:currentVertex.neighbors){

                //if the map does not contatin neighbours add them

                if(!map.containsKey(neighbour)){

                    //create clone

                    map.put(neighbour,new Node(neighbour.val));

                    //push the neighbour into the stack

                    stack.push(neighbour);
                }

                //connect the cloned version of the current node to the cloned version of the neighbour
                map.get(currentVertex).neighbors.add(map.get(neighbour));
            }
        }

        //return the cloned graph
        return map.get(node);

        
    }
}
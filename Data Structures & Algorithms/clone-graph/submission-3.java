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
    public Node cloneGraph(Node node) {

        //if node is null return null

        if(node==null){return null;}

        //take a hashmap to store the original ad cloned node
        HashMap<Node,Node>map=new HashMap<>();

        //take a stack to prform the DFS i.e to process the remaining elements
        Stack<Node>stack=new Stack<>();

        //clone
        Node clone=new Node(node.val);

        //put the original and the cloned node in the map
        map.put(node,clone);

        //push the node to the stack to start the dfs
        stack.push(node);

        while(!stack.isEmpty()){

            Node currentvertex=stack.pop();

            for(Node neighbour:currentvertex.neighbors){
                if(!map.containsKey(neighbour)){
                    map.put(neighbour,new Node(neighbour.val));
                    stack.push(neighbour);
                    
                }
                map.get(currentvertex).neighbors.add(map.get(neighbour));
            }

            

        } 

        return map.get(node);
        
    }
}
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

        if(node==null){return null;}

        HashMap<Node,Node>map=new HashMap<>();

        Stack<Node>stack=new Stack<>();

        Node clone=new Node(node.val);

        map.put(node,clone);
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
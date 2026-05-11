class Solution {
    public int countComponents(int n, int[][] edges) {

        List<List<Integer>>adjacencylist=new ArrayList<>();

        for(int i=0;i<n;i++){
            adjacencylist.add(new ArrayList<>());
        }

        HashSet<Integer>visited=new HashSet<>();
        Stack<Integer>stack=new Stack<>();

        int connectedcomponents=0;

        for(int[]edge:edges){

            adjacencylist.get(edge[0]).add(edge[1]);
            adjacencylist.get(edge[1]).add(edge[0]);
        }

        //check disconnected nodes
        for(int i=0;i<n;i++){
            if(!visited.contains(i))
            connectedcomponents++;

            stack.push(i);
            visited.add(i);

            while(!stack.isEmpty()){

                int currentvertex=stack.pop();

                for(int neighbour:adjacencylist.get(currentvertex)){
                    if(!visited.contains(neighbour)){
                    stack.push(neighbour);
                    visited.add(neighbour);
                    }
                }
            }
        }

        return connectedcomponents;

    }
}

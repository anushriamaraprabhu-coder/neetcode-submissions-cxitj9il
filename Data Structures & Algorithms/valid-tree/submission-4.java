class Solution {
    public boolean validTree(int n, int[][] edges) {

        //Time complexity: for graphs: O(v+e)----trees: O(V)
        //Space complexity: for graphs O(v+e)----trees: O(V)

        //check if the num of edges are 1 less than the num of node 
        if(edges.length!=n-1){return false;}

        //do the dfs traversal for checking if all the nodes are connected 

        HashSet<Integer>visited=new HashSet<>();
        Stack<Integer>stack=new Stack<>();

        List<List<Integer>>adjacencylist=new ArrayList<>();
        for(int i=0;i<n;i++)
        adjacencylist.add(new ArrayList<>());

        for(int[]edge:edges){
            adjacencylist.get(edge[0]).add(edge[1]);
            adjacencylist.get(edge[1]).add(edge[0]);
        }

        stack.push(0);
        visited.add(0);

        while(!stack.isEmpty()){

            int currentvertex=stack.pop();

            for(int neighbours:adjacencylist.get(currentvertex)){

                if(!visited.contains(neighbours)){
                    stack.push(neighbours);
                visited.add(neighbours);
                    //continue;
                }
                
            }

            if(visited.size()==n){
                return true;
            }
        }

        return false;

    }
}

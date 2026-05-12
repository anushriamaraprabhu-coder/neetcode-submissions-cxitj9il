class Solution {
    public boolean validTree(int n, int[][] edges) {

        if(edges.length!=n-1){return false;}

        List<List<Integer>>adjacencylist=new ArrayList<>();
        for(int i=0;i<n;i++)
        adjacencylist.add(new ArrayList<>());

        for(int[]edge:edges){
            adjacencylist.get(edge[0]).add(edge[1]);
            adjacencylist.get(edge[1]).add(edge[0]);
        }

        HashSet<Integer>visited=new HashSet<>();
        Stack<Integer>stack=new Stack<>();

        stack.push(0);
        visited.add(0);

        while(!stack.isEmpty()){
            
            int currentvertex=stack.pop();

            for(int neighbours:adjacencylist.get(currentvertex)){
                if(!visited.contains(neighbours)){
                    stack.push(neighbours);
                    visited.add(neighbours);
                }
            
            }
        }

        return visited.size()==n;




    }
}

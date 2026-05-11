class Solution {
    public boolean validTree(int n, int[][] edges) {
        
        if(edges.length!=n-1){return false;}

        List<List<Integer>>adjacencyList=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjacencyList.add(new ArrayList<>());
        }

        for(int[]edge:edges){
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }

        Stack<Integer>stack=new Stack<>();
        HashSet<Integer>visited=new HashSet<>();

       stack.push(0);
       visited.add(0);

       while(!stack.isEmpty()){

        int currentvertex=stack.pop();

        for(int neighbour:adjacencyList.get(currentvertex)){

            if(visited.contains(neighbour)){
                continue;          
            }

             stack.push(neighbour);
                visited.add(neighbour);
        }

        if(visited.size()==n){
            return true;
        }
    
       }

       return false;

        

    }
}

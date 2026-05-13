class Solution {
    public int countComponents(int n, int[][] edges) {

        List<List<Integer>>adjacencylist=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjacencylist.add(new ArrayList<>());
        }

        for(int[]edge:edges){

            adjacencylist.get(edge[0]).add(edge[1]);
            adjacencylist.get(edge[1]).add(edge[0]);

        }

        HashSet<Integer>visited=new HashSet<>();
        Stack<Integer>stack=new Stack<>();

         int components=0;

        for(int i=0;i<n;i++){

           

            if(!visited.contains(i)){
                components++;
            }

            stack.push(i);
            visited.add(i);

            while(!stack.isEmpty()){
                int currentvertex=stack.pop();

                for(int neighbours:adjacencylist.get(currentvertex)){

                    if(!visited.contains(neighbours)){
                        stack.push(neighbours);
                        visited.add(neighbours);
                    }
                }
            }
        }

        return components;

    }
}

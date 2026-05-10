class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        //Create an adjacency list
        List<List<Integer>>adjacencylist=new ArrayList<>();
        int[]inDegree=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        adjacencylist.add(new ArrayList<>());

        //iterate thru the list
        for(int[]pre:prerequisites){
            adjacencylist.get(pre[1]).add(pre[0]);
            inDegree[pre[0]]++;
        }

        //initialize the queue
        Queue<Integer>queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0)
            queue.offer(i);
        }

        //dfs logic 
        int count=0;

        while(!queue.isEmpty()){

            count++;
            
            int currentvertex=queue.poll();

            for(int neighbour:adjacencylist.get(currentvertex)){
                inDegree[neighbour]--;
                if(inDegree[neighbour]==0)
                queue.offer(neighbour);
            }
        }

        return count==numCourses;


        
    }
}

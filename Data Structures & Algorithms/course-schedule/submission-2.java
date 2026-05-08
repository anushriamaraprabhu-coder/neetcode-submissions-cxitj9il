class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>>adjacencyList=new ArrayList<>();
        int[]inDegree=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        adjacencyList.add(new ArrayList<>());

        //populate map 
        for(int[]pre:prerequisites){
            adjacencyList.get(pre[1]).add(pre[0]);
            inDegree[pre[0]]++;
        }

        //add to queue 
        Queue<Integer>queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0)
            queue.offer(i);
        }

        int count=0;

        while(!queue.isEmpty()){

             count++;

            int currenvertex=queue.poll();

            for(int neighbour:adjacencyList.get(currenvertex)){
                inDegree[neighbour]--;
                if(inDegree[neighbour]==0){

                    queue.offer(neighbour);            

                }
            }
        }

        return count==numCourses;
        
    }
}

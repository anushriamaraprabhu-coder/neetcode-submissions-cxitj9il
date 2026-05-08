class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>>adjacencyList=new ArrayList<>();
        int[]inDegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            adjacencyList.add(new ArrayList<>());
        }

        //iterate thru your pre requisite list and populate the map.
        for(int[]pre:prerequisites){
            adjacencyList.get(pre[1]).add(pre[0]);
            inDegree[pre[0]]++;
        }

        //initialize your queue 
        Queue<Integer>queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0)
            queue.offer(i);
        }

        //BFS traversal pattern

        int count=0;
        while(!queue.isEmpty()){

            int currentvertex=queue.poll();
            count++;
            for(int neighbours:adjacencyList.get(currentvertex)){
                inDegree[neighbours]--;
                if(inDegree[neighbours]==0)
                queue.offer(neighbours);
            }
        }

        return count==numCourses;
        
    }
}

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>>adjacencylist=new ArrayList<>();
        int[]inDegree=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        adjacencylist.add(new ArrayList<>());

        for(int[]pre:prerequisites){
            adjacencylist.get(pre[1]).add(pre[0]);
            inDegree[pre[0]]++;
        }

        Queue<Integer>queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0){
                queue.offer(i);
            }
        }

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

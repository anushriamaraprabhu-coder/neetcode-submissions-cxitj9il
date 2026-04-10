class Solution {
    public int lastStoneWeight(int[] stones) {

        //Initialize the priority queue

        PriorityQueue<Integer>queue=new PriorityQueue<>(Collections.reverseOrder());

        //add elements to the queue

        for(int stone:stones){
            queue.add(stone);
        }

        //check the loop till the size of the queue>1

        while(queue.size()>1){

            //Poll out the 1st 2 elements i.e x and y out of the queue

            int y=queue.poll();
            int x=queue.poll();

            //Check if x!=y and if so get their diff and add them to the queue

            if(x!=y){
                queue.add(y-x);
                }
        }

        return queue.isEmpty()?0:queue.poll();


    }
}

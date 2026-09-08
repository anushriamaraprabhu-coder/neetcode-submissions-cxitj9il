class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer>dequeue=new ArrayDeque<>();

        int[]result=new int[nums.length-k+1];
        int index=0;

        for(int right=0;right<nums.length;right++){

            int left=right-k+1;

            if(!dequeue.isEmpty() && dequeue.peekFirst()<left){
                dequeue.pollFirst();
            }

            while(!dequeue.isEmpty() && nums[dequeue.peekLast()]<nums[right]){
                dequeue.pollLast();
            }

            dequeue.offerLast(right);

            if(left>=0){
                result[index]=nums[dequeue.peekFirst()];
                index++;
            }


        }

        return result;



    
        
    }
}

class Solution {
    public int largestRectangleArea(int[] heights) {

        Deque<int[]>stack=new ArrayDeque<>();
        int maxarea=0;

        for(int i=0;i<heights.length;i++){

           int start=i;

            while(!stack.isEmpty() && heights[i]<stack.peek()[1]){

                
                int[]popped=stack.pop();
                int width=i-popped[0];
                int area=popped[1]*width;

                maxarea=Math.max(area,maxarea);
                start=popped[0];
            }

            stack.push(new int[]{start,heights[i]});
        }

        while(!stack.isEmpty()){
            
            int[]popped=stack.pop();
            int width=heights.length-popped[0];

            int area=popped[1]*width;
            maxarea=Math.max(area,maxarea);
        }

        return maxarea;


        
    }
}

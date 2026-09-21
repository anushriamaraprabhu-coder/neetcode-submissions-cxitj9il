class Solution {
    public int maxArea(int[] heights) {

        int left=0;
        int right=heights.length-1;
        int maxarea=0;

        while(left<right){

            int currentheight=Math.min(heights[left],heights[right]);
            int width=right-left;
            int currentarea=currentheight*width;
            maxarea=Math.max(maxarea,currentarea); 

            if(heights[left]<heights[right]){
                left++;
            }

            else{

                right--;
            }


        }

        return maxarea;
        
    }
}

class Solution {
    public int maxArea(int[] heights) {

        int maxarea=0;

        int left=0;
        int right=heights.length-1;

        while(left<right){

            int currentheight=Math.min(heights[left],heights[right]);
            int currentwidth=right-left;

            int currentarea=currentheight*currentwidth;

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

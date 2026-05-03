class Solution {
    public int maxArea(int[] heights) {

        int left=0;
        int right=heights.length-1;
        int maxarea=0;

        while(left<right){

            int currentarea=Math.min(heights[right],heights[left])*(right-left);
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

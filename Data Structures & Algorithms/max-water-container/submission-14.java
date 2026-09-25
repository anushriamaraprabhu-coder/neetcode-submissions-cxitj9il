class Solution {
    public int maxArea(int[] heights) {

        int left=0;
        int right=heights.length-1;
        int maxarea=0;

        while(left<right){

            int currlen=Math.min(heights[left],heights[right]);
            int width=right-left;
            int currarea=currlen*width;

            maxarea=Math.max(maxarea,currarea);

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

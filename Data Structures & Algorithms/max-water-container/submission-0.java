class Solution {
    public int maxArea(int[] heights) {

        int leftStick=0;
        int rightStick=heights.length-1;

        int maxArea=0;

        while(leftStick<rightStick){

            int area=Math.min(heights[leftStick],heights[rightStick])*(rightStick-leftStick);

            maxArea=Math.max(area,maxArea);

            if(heights[leftStick]<heights[rightStick]) leftStick++;
                
            else rightStick--;
            
        }

        return maxArea;


        
    }
}

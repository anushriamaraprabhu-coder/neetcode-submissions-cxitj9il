class Solution {
    public int maxArea(int[] heights) {

        int maxArea=0;
        int leftStick=0;
        int rightStick=heights.length-1;

        while(leftStick<rightStick){

            int currentArea=Math.min(heights[leftStick],heights[rightStick])*(rightStick-leftStick);

            maxArea=Math.max(currentArea,maxArea);
        

        if(heights[leftStick]<heights[rightStick]) leftStick++;
        else rightStick--;

        }

        return maxArea;
        
        
    }
}

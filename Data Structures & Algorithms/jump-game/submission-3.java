class Solution {
    public boolean canJump(int[] nums) {

        int finalindex=nums.length-1;

        for(int index=nums.length-2;index>=0;index--){
            if(index+nums[index]>=finalindex){
                finalindex=index;
            }
        }
        return finalindex==0;
        
    }
}

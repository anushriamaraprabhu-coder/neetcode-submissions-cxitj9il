class Solution {
    public boolean canJump(int[] nums) {

        int finalindex=nums.length-1;

        for(int currentindex=nums.length-2;currentindex>=0;currentindex--){

            if(currentindex+nums[currentindex]>=finalindex){
                finalindex=currentindex;
            }
        }

        return finalindex==0;
        
    }
}

class Solution {
    public int rob(int[] nums) {

        if(nums.length<2){
            return nums[0];
        }

        int[]maxloot=new int[nums.length];

        maxloot[0]=nums[0];
        maxloot[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            maxloot[i]=Math.max(maxloot[i-2]+nums[i] , maxloot[i-1]);
        }

        return maxloot[nums.length-1];
        
    }
}

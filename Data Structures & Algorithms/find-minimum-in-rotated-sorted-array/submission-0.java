class Solution {
    public int findMin(int[] nums) {

        int minNumber=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]<minNumber){
                minNumber=nums[i];
            }
        }

        return minNumber;
        
    }
}

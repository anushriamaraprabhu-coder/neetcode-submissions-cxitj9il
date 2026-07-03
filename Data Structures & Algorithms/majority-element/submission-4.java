class Solution {
    public int majorityElement(int[] nums) {

        int candidate=0;
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            }
            if(nums[i]==candidate){
                count++;
            }
            else{
                count--;
            }
        }

        count=0;
        for(int num:nums){
            if(num==candidate){
                count++;
            }
        }

        return(count>nums.length/2) ? candidate : -1;


        
    }
}
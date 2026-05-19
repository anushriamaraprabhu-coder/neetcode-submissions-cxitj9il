class Solution {
    public int maxSubArray(int[] nums) {

        int len=nums.length;
        int leftsum=0;
        int rightsum=0;

        int maxsum=nums[0];

        for(int i=0;i<len;i++){

            leftsum+=nums[i];
            rightsum+=nums[len-1-i];

            maxsum=Math.max(maxsum,Math.max(leftsum,rightsum));

            if(leftsum<0){leftsum=0;}
            if(rightsum<0){rightsum=0;}
            
        }

        return maxsum;
        
    }
}

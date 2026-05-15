class Solution {
    public int lengthOfLIS(int[] nums) {

        int[]dp=new int[nums.length];

        //start the main/i pointer
        for(int i=1;i<nums.length;i++){

            //start the second pointer

            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                    }
                }
            }
        }

            //find the maxlength
            int maxlen=0;
            for(int i=0;i<dp.length;i++){
                if(dp[i]>dp[maxlen])
                maxlen=i;
            }
        

        return dp[maxlen]+1;
        
    }
}

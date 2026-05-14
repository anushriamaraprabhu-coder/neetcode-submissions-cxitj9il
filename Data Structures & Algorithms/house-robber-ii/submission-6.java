class Solution {
    public int rob(int[] nums) {

        if(nums.length<2){return nums[0];}

        

        int skiplasthouse=robbing(nums,0,nums.length-2);
        int skipfirsthouse=robbing(nums,1,nums.length-1);

        return Math.max(skiplasthouse,skipfirsthouse);
               
    }

    private int robbing(int[]nums,int start,int end){

        int prev2=0;
        int prev1=0;

        for(int i=start;i<=end;i++){

            int current=Math.max(prev2+nums[i],prev1);

            prev2=prev1;
            prev1=current;
        }

        return prev1;
    }
}

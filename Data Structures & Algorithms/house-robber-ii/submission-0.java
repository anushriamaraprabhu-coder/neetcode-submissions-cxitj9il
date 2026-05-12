class Solution {
    public int rob(int[] nums) {

        if(nums.length<2){return nums[0];}

        //initialize 2 arrays to skip first and last house
        int[]skipfirsthouse=new int[nums.length-1];
        int[]skiplasthouse=new int[nums.length-1];

        //populate the 2 arrays 
        for(int i=0;i<nums.length-1;i++){
            skipfirsthouse[i]=nums[i+1];
            skiplasthouse[i]=nums[i];           
        }

        int maxlootskippingfirst=robbing(skipfirsthouse);
        int maxlootskippinglast=robbing(skiplasthouse);

        return Math.max(maxlootskippingfirst,maxlootskippinglast);
        
    }

    private int robbing(int[]nums){

        if(nums.length<2){return nums[0];}

        

        int prevhouse=nums[0];
        int nexthouse=Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            int current=Math.max(prevhouse+nums[i],nexthouse);

            prevhouse=nexthouse;
            nexthouse=current;
        }

        return nexthouse;

    }
}

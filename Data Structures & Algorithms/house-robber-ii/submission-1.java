class Solution {
    public int rob(int[] nums) {

        if(nums.length<2){return nums[0];}

        int[]skipfirsthouse=new int[nums.length-1];
        int[]skiplasthouse=new int[nums.length-1];

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

        int secondhouse=nums[0];
        int firsthouse=Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            int currenthouse=Math.max(secondhouse+nums[i],firsthouse);
        

        secondhouse=firsthouse;
        firsthouse=currenthouse;
        }

        return firsthouse;
    }
}

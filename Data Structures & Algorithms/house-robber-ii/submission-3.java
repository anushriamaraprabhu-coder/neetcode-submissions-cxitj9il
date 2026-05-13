class Solution {
    public int rob(int[] nums) {

        //time complexity=O(n);
        //space complexity=O(1);

        if(nums.length<2){return nums[0];}

        int skiplasthouse=robbing(nums,0,nums.length-2);
        int skipfirsthouse=robbing(nums,1,nums.length-1);

        return Math.max(skiplasthouse,skipfirsthouse);


        
    }

    private int robbing(int[]nums,int start,int end){

        if(nums.length<2){return nums[0];}

        int firsthouse=0;
        int secondhouse=0;

        for(int i=start;i<=end;i++){
            int currenthouse=Math.max(secondhouse+nums[i],firsthouse);

            secondhouse=firsthouse;
            firsthouse=currenthouse;

            
        }

        return firsthouse;
        
    }
}

class Solution {
    public int rob(int[] nums) {

        //timecomplexity= O(n);
        //spacecomplexity= O(1);

        if(nums.length<2){return nums[0];}

        int skiplasthouse=robbing(nums,0,nums.length-2);
        int skipfirsthouse=robbing(nums,1,nums.length-1);

        return Math.max(skiplasthouse,skipfirsthouse);
        
    }

    private int robbing(int[]nums,int start,int end){

        int maxlootfirsthouse=0;
        int maxlootsecondhouse=0;

        for(int i=start;i<=end;i++){

            int currenthouse=Math.max(maxlootsecondhouse+nums[i],maxlootfirsthouse);

            maxlootsecondhouse=maxlootfirsthouse;
            maxlootfirsthouse=currenthouse;
        }

        return maxlootfirsthouse;


    }
}

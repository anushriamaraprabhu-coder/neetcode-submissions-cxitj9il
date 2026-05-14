class Solution {
    public int maxProduct(int[] nums) {

        int len=nums.length;
        int leftproduct=1;
        int rightproduct=1;
        int result=nums[0];

       

        for(int i=0;i<len;i++){

             leftproduct=leftproduct==0?1:leftproduct;
        rightproduct=rightproduct==0?1:rightproduct;

            leftproduct*=nums[i];
            rightproduct*=nums[len-1-i];

            result=Math.max(result,Math.max(leftproduct,rightproduct));

        }

        return result;


        
    }
}

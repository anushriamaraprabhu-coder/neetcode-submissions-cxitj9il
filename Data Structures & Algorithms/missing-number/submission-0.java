class Solution {
    public int missingNumber(int[] nums) {

        int XOR=0;

        //XOR all the elements in range

        for(int i=0;i<=nums.length;i++){
            XOR=XOR^i;
        }

        //XOR the existing range XOR elements with nums array elements

        for(int num:nums){
            XOR=XOR^num;
        }

        return XOR;
        
    }
}

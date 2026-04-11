class Solution {
    public int[] plusOne(int[] digits) {

        int len=digits.length;

        //reverse the loop

        for(int i=len-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;

            }

            digits[i]=0;
            
        }

        //single dgit

        int[]newNum=new int[len+1];
        newNum[0]=1;
        return newNum;
     
        
    }
}

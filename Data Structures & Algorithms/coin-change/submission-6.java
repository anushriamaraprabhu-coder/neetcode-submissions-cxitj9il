class Solution {
    public int coinChange(int[] coins, int amount) {

        //Brute force approach: O(N^A) SC: O(A);
        //optimal soulution TC: O(NxA) SC: O(A);

        int[]dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;

        for(int currentamount=1;currentamount<=amount;currentamount++){
            for(int coin:coins){
                if(coin<=currentamount){
                    dp[currentamount]=Math.min(dp[currentamount],dp[currentamount-coin]+1);
                }
            }
        }

        return (dp[amount]>amount? -1 : dp[amount]);
        
    }
}

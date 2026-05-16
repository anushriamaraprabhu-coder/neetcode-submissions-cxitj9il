class Solution {
    public int coinChange(int[] coins, int amount) {

        int[]dp=new int[amount+1];

        Arrays.fill(dp,amount+1);

        dp[0]=0;

        for(int currentamount=1;currentamount<=amount;currentamount++){

            for(int coin:coins){
                if(coin<=currentamount){

                    dp[currentamount]=Math.min(dp[currentamount],dp[currentamount-coin]+1);
                    //dp[currentamount-coin]= coins required to make the rem amount
                    //we are adding +1 to take count pf current coin itself.
                    //dp[currentamount]= gives the best coin count got so far.
                }
            }
        }

        return (dp[amount]>amount?-1:dp[amount]);
        
    }
}

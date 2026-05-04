class Solution {
    public int maxProfit(int[] prices) {

        int buyPrice=prices[0];
        int maxProfit=0;
        //int currentProfit=0;

        for(int i=1;i<prices.length;i++){

            
         buyPrice=Math.min(buyPrice,prices[i]);
         maxProfit=Math.max(maxProfit,prices[i]-buyPrice);
           
        }

         return maxProfit;

        
    }
}

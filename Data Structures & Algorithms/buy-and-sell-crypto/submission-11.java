class Solution {
    public int maxProfit(int[] prices) {

        int buyprice=prices[0];
        int maxprofit=0;

        for(int price:prices){

            int currentprofit=price-buyprice;
            maxprofit=Math.max(currentprofit,maxprofit);

            if(price<buyprice){
                buyprice=price;
            }
        }

        return maxprofit;
        
    }
}

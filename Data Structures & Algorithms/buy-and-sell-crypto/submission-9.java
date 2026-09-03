class Solution {
    public int maxProfit(int[] prices) {

        int buyPrice=prices[0];

        //int minPrice=0;

        int maxprofit=0;

        for(int price:prices){

            int currentprofit=price-buyPrice;

            if(currentprofit>maxprofit){
                maxprofit=currentprofit;
            }

            if(price<buyPrice){
                buyPrice=price;
            }

            
        }

        return maxprofit;
        
    }
}

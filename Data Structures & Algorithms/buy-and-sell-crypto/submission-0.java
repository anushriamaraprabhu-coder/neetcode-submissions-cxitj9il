class Solution {
    public static int maxProfit(int[] prices) {

        int max_profit=0;
        int buy_price=prices[0];

        for(int i=1;i<prices.length;i++){
            int curr_price=prices[i]-buy_price;
            if(curr_price>max_profit){
                max_profit=curr_price;
            }

            if(prices[i]<buy_price){
                buy_price=prices[i];
            }
        }

        return max_profit;
    
    }

    public static void main(String[]args){

        int[]prices={3,4,2,5,6,7};
        maxProfit(prices);
    }
}

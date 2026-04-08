class Solution {
    public static int maxProfit(int[] prices) {

        int maxProfit=0;
        int buyPrice=prices[0];

        for(int i=1;i<prices.length;i++){
            int curPrice=prices[i]-buyPrice;
            if(curPrice>maxProfit){
                maxProfit=curPrice;
            }
            else{
                if(prices[i]<buyPrice){
                    buyPrice=prices[i];
                }
            }
        }
        return maxProfit;
        
    }

    public static void main(String[]args){
        int[] prices={10,1,5,6,7,1};
        maxProfit(prices);
    }
}

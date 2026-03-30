class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int profit = 0;
       for(int i = 0 ; i < prices.length; i++){ 
        if(prices[i] < prices[buy]){
            buy = i;
        }
        if(profit < prices[i] - prices[buy]){
            profit = prices[i] - prices[buy];
        }
       }
        return profit;
    }
}

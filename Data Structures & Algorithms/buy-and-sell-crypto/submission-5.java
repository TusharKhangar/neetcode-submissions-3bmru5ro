class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 0;
        int profit = 0;
        for(int i = 0 ; i < prices.length; i++){
           if(prices[i] < prices[buy]){
                buy = i;
                sell = i;
           }else {
                if(sell+1 < prices.length)sell++;
           }
           profit = Math.max(prices[sell] - prices[buy], profit);

        }
        return profit;
    }
}

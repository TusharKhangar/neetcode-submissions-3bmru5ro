class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MIN_VALUE;
        int sell = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i; j < prices.length; j++){
                sell = Math.max(prices[j] - prices[i], sell);
            }
        }
        return sell;
    }
}

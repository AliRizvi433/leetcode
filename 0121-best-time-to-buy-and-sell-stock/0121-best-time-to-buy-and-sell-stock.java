class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int x: prices){
        minPrice = Math.min(minPrice, x);
        int profit = x - minPrice;
        maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
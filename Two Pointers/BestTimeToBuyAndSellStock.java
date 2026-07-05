public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices){
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            minPrice = Integer.min(minPrice,prices[i]);
            maxProfit = Integer.max(maxProfit,prices[i] - minPrice);
        }
        return maxProfit;
    }
}

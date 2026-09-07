//public class BestTimeToBuyAndSellStock {
//    public int maxProfit(int[] prices){
//        int min = Integer.MAX_VALUE;
//        int profit = -1;
//        for(int i = 0; i < prices.length; i++){
//            min = Math.min(min,prices[i]);
//            profit = Math.max(profit, prices[i] - min);
//        }
//        return profit;
//    }
//    public int maxProfit(int[] prices){
//        int profit = 0;
//        for(int i = 0; i < prices.length; i++){
//            for(int j = i + 1; j < prices.length; j++){
//                profit = Math.max(profit, prices[j] - prices[i]);
//            }
//        }
//        return profit;
//    }
//}

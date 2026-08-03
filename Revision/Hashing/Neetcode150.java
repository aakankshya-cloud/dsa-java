import java.util.*;

public class Neetcode150 {
    public int maxProfit(int[] prices){
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 1; i < prices.length; i++){
            min = Math.min(min,prices[i - 1]);
            max = Math.max(max , prices[i] - min);
        }
        return max;
    }
}

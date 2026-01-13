import java.util.*;
public class Best_Time_To_Sell_And_Buy_Stocks {
    public int maxProfit(int[] prices) {
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            int buy = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > buy) {
                    max = Math.max(max, prices[j] - buy);
                }
            }
        }

        return max;
    }
    
    public static void main(String[] args) {
        Best_Time_To_Sell_And_Buy_Stocks solution = new Best_Time_To_Sell_And_Buy_Stocks();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + solution.maxProfit(prices)); 
    }
}


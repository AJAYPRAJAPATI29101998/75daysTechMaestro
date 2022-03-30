package day1;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int diff;
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            diff = prices[i]-buy;
            buy = Math.min(buy , prices[i]);
            profit = Math.max(diff , profit);

        }
        return profit;

    }

    }


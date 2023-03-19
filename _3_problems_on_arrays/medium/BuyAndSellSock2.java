package _3_problems_on_arrays.medium;

public class BuyAndSellSock2 {
    public static void main(String[] args) {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(stockPrices));
    }

    public static int maxProfit(int[] prices) {
        int maxPro = 0;

        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1]) {
                maxPro += prices[i] - prices[i-1];
            }
        }

        return maxPro;
    }
}

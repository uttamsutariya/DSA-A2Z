package _3_problems_on_arrays.medium;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] stocks = {7,1,5,3,6,4,9};
        System.out.println(maxProfit(stocks));
    }

    public static int maxProfit(int[] prices) {
        /**
         * brute force
         */

//        int maxPro = 0;
//
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i+1; j < prices.length; j++) {
//                if(prices[j] > prices[i]) {
//                    maxPro = Math.max(maxPro, prices[j] - prices[i]);
//                }
//            }
//        }
//
//        return maxPro;

        /**
         * optimal
         *
         * for current date, check in past for minimum price for that profit could be maximized
         */

        int maxProfit = 0;
        int msf = Integer.MAX_VALUE;

        for (int i : prices) {
            msf = Math.min(msf, i);
            maxProfit = Math.max(maxProfit, i - msf);
        }

        return maxProfit;
    }
}

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// https://takeuforward.org/data-structure/stock-buy-and-sell/

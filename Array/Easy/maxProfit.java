// Problem: Best Time to Buy and Sell Stock
class Solution {
    public int maxProfit(int[] prices) {
        // method 1: using two pointers
        int i = 0;
        int maxProfit = 0;
        for(int j = 0; j < prices.length; j++){
            //here we are checking if the price at j is greater than the price at i
            if(prices[j] > prices[i]){
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            } else {
                i = j;
            }
        }
        return maxProfit;

        // method 2: using one pointer
        // int maxProfit = 0;
        // int minPrice = Integer.MAX_VALUE;
        // for(int i = 0; i < prices.length; i++){
        //     if(prices[i] < minPrice){
        //         minPrice = prices[i];
        //     } else if(prices[i] - minPrice > maxProfit){
        //         maxProfit = prices[i] - minPrice;
        //     }
        // }
        // return maxProfit;

        // method 3: using brute force
        // int maxProfit = 0;
        // for(int i = 0; i < prices.length; i++){
        //     for(int j = i + 1; j < prices.length; j++){
        //         if(prices[j] - prices[i] > maxProfit){
        //             maxProfit = prices[j] - prices[i];
        //         }
        //     }
        // }
        // return maxProfit;
    }
}

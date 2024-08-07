//122. Best Time to Buy and Sell Stock II

class Solution {
    public int maxProfit(int[] prices) {
        //method 1: using one pass
        int maxProfit = 0;

        for(int i = 1; i<prices.length; i++){
            if(prices[i] > prices[i-1]){
            maxProfit += prices[i] - prices[i-1];        
            }        
        }

        return maxProfit;

        //method 2: using peak and valley
        // int i = 0;
        // int valley = prices[0];
        // int peak = prices[0];
        // int maxProfit = 0;
        // while(i < prices.length - 1){
        //     while(i < prices.length - 1 && prices[i] >= prices[i+1]){
        //         i++;
        //     }
        //     valley = prices[i];
        //     while(i < prices.length - 1 && prices[i] <= prices[i+1]){
        //         i++;
        //     }
        //     peak = prices[i];
        //     maxProfit += peak - valley;
        // }
        // return maxProfit;
    }
}
package com.satyam.leetcode.arrays.fundamentals;

public class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minCost = prices[0]; //by default but at day 0
        for(int i = 0; i < prices.length; i++){
            profit = Math.max(profit,prices[i] - minCost);
            minCost = Math.min(minCost,prices[i]);
        }
        return profit;
    }
}

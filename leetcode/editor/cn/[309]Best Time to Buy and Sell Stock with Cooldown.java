//You are given an array prices where prices[i] is the price of a given stock 
//on the iᵗʰ day. 
//
// Find the maximum profit you can achieve. You may complete as many 
//transactions as you like (i.e., buy one and sell one share of the stock multiple times) 
//with the following restrictions: 
//
// 
// After you sell your stock, you cannot buy stock on the next day (i.e., 
//cooldown one day). 
// 
//
// Note: You may not engage in multiple transactions simultaneously (i.e., you 
//must sell the stock before you buy again). 
//
// 
// Example 1: 
//
// 
//Input: prices = [1,2,3,0,2]
//Output: 3
//Explanation: transactions = [buy, sell, cooldown, buy, sell]
// 
//
// Example 2: 
//
// 
//Input: prices = [1]
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 1 <= prices.length <= 5000 
// 0 <= prices[i] <= 1000 
// 
//
// Related Topics 数组 动态规划 👍 1624 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) return 0;
        int[][] dp = new int[prices.length][2];
        // dp[i][0]表示第i天持有股票的最大收益，dp[i][1]表示第i天不持有股票的最大收益
        dp[0][0] = -prices[0]; dp[0][1] = 0;
        dp[1][0] = Math.max(dp[0][0], -prices[1]); dp[1][1] = Math.max(dp[0][1], dp[0][0] + prices[1]);
        for(int i = 2; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 2][1] - prices[i]);
            // 第i天持有股票的最大收益 = max(第i-1天持有股票的最大收益，第i-2天不持有股票的最大收益 - 第i天股票价格)
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
            // 第i天不持有股票的最大收益 = max(第i-1天不持有股票的最大收益，第i-1天持有股票的最大收益 + 第i天股票价格)
        }
        return dp[prices.length - 1][1];

    }
}
//leetcode submit region end(Prohibit modification and deletion)

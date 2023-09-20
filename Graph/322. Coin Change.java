class Solution {
    int count=0;
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];//[ind][amount]
        for(int[] rows : dp)
            Arrays.fill(rows,-1);
        dp[n-1][amount] = f(coins.length-1, amount, coins,dp);
        if(dp[n-1][amount] < (int)(1e5))
            return dp[n-1][amount];
        return -1;
    }
    //Memoization
    public int f(int ind, int amount, int[] coins, int[][] dp) {
        if (ind == 0) {
            if (amount % coins[ind] == 0) {
                return amount / coins[ind];
            } else {
                return (int)(1e5);
            }
        }
        if(dp[ind][amount] != -1)   return dp[ind][amount];
        int notpick = f(ind - 1, amount, coins,dp);
        int pick = (int)(1e5);
        if (amount >= coins[ind]) {
            pick = 1 + f(ind, amount - coins[ind], coins,dp);
        }
        return dp[ind][amount] = Math.min(pick, notpick);
    }
}
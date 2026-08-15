class Solution {
    public int coinChange(int[] coins, int amount) {

        int dp[][]=new int[coins.length][amount+1];
        for(int t=0;t<=amount;t++)
        {
             if(t % coins[0] == 0) {
        dp[0][t] = t / coins[0];
    } else {
        dp[0][t] = Integer.MAX_VALUE;
    }
        }
        for(int i=1;i<dp.length;i++)
        {
            for(int t=1;t<=amount;t++)
            {
                int notpick=dp[i-1][t];
        int pick=Integer.MAX_VALUE;
        if(t>=coins[i])
        {
            int result=dp[i][t-coins[i]];
            if(result!=Integer.MAX_VALUE)
            {
                pick=1+result;
            }
        }
         

        dp[i][t]= Math.min(pick,notpick);

            }
        }
       
        return dp[dp.length - 1][amount] == Integer.MAX_VALUE
                ? -1
                : dp[dp.length  - 1][amount];
    }
   
}
class Solution {
    public int coinChange(int[] coins, int amount) {
       
        int dp[][]=new int[coins.length][amount+1];
       for(int t=0;t<=amount;t++)
       {
          if(t%coins[0]==0)
          {
            dp[0][t]= t/coins[0];
          }else{
            dp[0][t]=(int)1e9;
          }

       }
       for(int i=1;i<coins.length;i++)
       {
        for(int t=0;t<=amount;t++)
        {
             int nottake=0+dp[i-1][t];
  int take=Integer.MAX_VALUE;
      if(coins[i]<=t)
      {
         take=1+dp[i][t-coins[i]];
      }
     dp[i][t]= Math.min(take,nottake);
    

        }
       }
       if(dp[coins.length-1][amount]>=(int) 1e9) return -1;
       return dp[coins.length-1][amount];

    }
    // public int fun(int i,int target,int[] coins,int[][] dp)
    // {
         
    //     if(target==0) return 0;
    //     if(dp[i][target] != -1) return dp[i][target];
    //     if(i==0)
    //     {
    //         if(target%coins[i]==0) return target/coins[0];
    //         else return (int) 1e9;
    //     }


    //     int nottake=0+fun(i-1,target,coins,dp);
    //     int take=Integer.MAX_VALUE;
    //     if(coins[i]<=target)
    //     {
    //         take=1+fun(i,target-coins[i],coins,dp);
    //     }
    //     dp[i][target]= Math.min(take,nottake);
    //     return dp[i][target];
    // }
}
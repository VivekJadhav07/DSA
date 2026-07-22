class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp1[]=new int[cost.length+1];
        int cost1[]=new int[cost.length-1];
         int dp2[]=new int[cost1.length+1];
        for(int i=1;i<cost.length;i++)
        {
            cost1[i-1]=cost[i];
        }
       return Math.min(fun(cost,dp1),fun(cost1,dp2));
        
    }
    public int fun(int cost[],int[] dp)
    {
         dp[0]=0;
        for(int i=1;i<dp.length;i++)
        {
            int jump1=cost[i-1]+dp[i-1];
            int jump2=Integer.MAX_VALUE;
         
                 if(i>1)
            {
                 jump2=cost[i-2]+dp[i-2];
            }
            dp[i]=Math.min(jump1,jump2);

        }
        return dp[dp.length-1];
    }
}
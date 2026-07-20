class Solution {
    public int fib(int n) {
        // int dp[]=new int[n+1];
        if(n<=1)
        {
            return n;
        }
      
        int prev2=0;
        int prev1=1;
        int curr=0;
        for(int i=2;i<=n;i++)
        {
           curr=prev2+prev1;
          prev2=prev1;
          prev1=curr;
          
        }
        return curr;
       
        
    }
    //     public int fib1(int n,int[] dp) {
        
    //      if(n<=1)
    //      {
    //         return n;
    //      }
    //      if(dp[n]!=-1) return dp[n];

    //      dp[n]= fib1(n-1,dp)+fib1(n-2,dp);
    //      return dp[n];
        
    // }
      
      
}
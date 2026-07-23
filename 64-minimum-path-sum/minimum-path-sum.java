class Solution {
  
    public int minPathSum(int[][] grid) {
        
        int dp[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
       
       return f(grid,grid.length-1,grid[0].length-1,dp);
    }
    public int f(int [][] grid,int m,int n,int[][] dp)
    {
        
        if(m==0 && n==0)
        {
           return grid[0][0];
        }
      

        int left=Integer.MAX_VALUE;
        int down=Integer.MAX_VALUE;
        if(m>=0 && n>=0)
        {
         if(dp[m][n]!=-1) return dp[m][n];
        }

        if(n>0) 
        {
        left=grid[m][n]+ f(grid,m,n-1,dp);
        }
        if(m>0)
        {
         down=grid[m][n]+ f(grid,m-1,n,dp);
        }
        dp[m][n]= Math.min(left,down);
          return dp[m][n];
        
    }
}
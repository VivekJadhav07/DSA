class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int dp[][]=new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i=0;i<obstacleGrid.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return f(obstacleGrid.length-1,obstacleGrid[0].length-1,dp,obstacleGrid);
    }
    public int f(int m,int n,int dp[][],int [][] arr)
    {
          
        if(m<0 || n<0) return 0;
        if(arr[m][n]==1) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(m==0 && n==0) return 1;
       
        
        
        
      

        int up=f(m-1,n,dp,arr);
        int left=f(m,n-1,dp,arr);
        dp[m][n] =up+left;
        return dp[m][n];
    

    }
}
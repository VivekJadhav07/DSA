class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int dp[][]=new int[obstacleGrid.length][obstacleGrid[0].length];

        if(obstacleGrid[0][0]==1)
        {
            dp[0][0]=0;
        }else{
            dp[0][0]=1;
        }
        for(int i=0;i<obstacleGrid.length;i++)
        {
            for(int j=0;j<obstacleGrid[0].length;j++)
            {
                if(i==0 && j==0 ) continue;
                if(obstacleGrid[i][j]==1) continue;
                int up=0;
                if(i>0)
                {
                 up=dp[i-1][j];
                }
                int left=0;
                if(j>0)
                {
                 left=dp[i][j-1];
                }
                dp[i][j]=up+left;
            }
          
        }
          return dp[dp.length-1][dp[0].length-1];
        
    }
    // public int f(int m,int n,int dp[][],int [][] arr)
    // {
          
    //     if(m<0 || n<0) return 0;
    //     if(arr[m][n]==1) return 0;
    //     if(dp[m][n]!=-1) return dp[m][n];
    //     if(m==0 && n==0) return 1;
       
        
        
        
      

    //     int up=f(m-1,n,dp,arr);
    //     int left=f(m,n-1,dp,arr);
    //     dp[m][n] =up+left;
    //     return dp[m][n];
    

    // }
}
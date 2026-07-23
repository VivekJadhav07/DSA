class Solution {
  
    public int minPathSum(int[][] grid) {
        
        int dp[][]=new int[grid.length][grid[0].length];
        dp[0][0]=grid[0][0];
        for(int i=0;i<grid.length;i++)
        {
              for(int j=0;j<grid[0].length;j++)
                 {
                    if(i==0 && j==0) continue;
                    int left=Integer.MAX_VALUE;
                    int down=Integer.MAX_VALUE;
                  if(i>0) left=grid[i][j]+dp[i-1][j];
                  if(j>0) down=grid[i][j]+dp[i][j-1];
                  dp[i][j]=Math.min(left,down);
                 }
                 
            
        }
        return dp[dp.length-1][dp[0].length-1];
       
    //    return f(grid,grid.length-1,grid[0].length-1,dp);
    }
}
//     public int f(int [][] grid,int m,int n,int[][] dp)
//     {
        
//         if(m==0 && n==0)
//         {
//            return grid[0][0];
//         }
      

//         int left=Integer.MAX_VALUE;
//         int down=Integer.MAX_VALUE;
//         if(m>=0 && n>=0)
//         {
//          if(dp[m][n]!=-1) return dp[m][n];
//         }

//         if(n>0) 
//         {
//         left=grid[m][n]+ f(grid,m,n-1,dp);
//         }
//         if(m>0)
//         {
//          down=grid[m][n]+ f(grid,m-1,n,dp);
//         }
//         dp[m][n]= Math.min(left,down);
//           return dp[m][n];
        
//     }
// }
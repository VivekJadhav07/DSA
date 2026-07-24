class Solution {
    public int cherryPickup(int[][] grid) {
        int dp[][][]=new int[grid.length][grid[0].length][grid[0].length];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                Arrays.fill(dp[i][j],-1);
            }
        }
        int i=0;
        int j1=0;
        int j2=grid[0].length-1;
        
        return f(grid,i,j1,j2,dp);
    }
    public int f(int[][] grid,int i,int j1,int j2,int dp[][][])
    {
        if(j1<0 || j1>grid[0].length-1 || j2<0 || j2>grid[0].length-1) return (int)(-1e9);
        if(dp[i][j1][j2]!=-1) return dp[i][j1][j2];
        if(i==grid.length-1 )
        {
            if(j1==j2) return grid[i][j1];
            if(j1!=j2) return grid[i][j1]+grid[i][j2];
        }
            int maxi=0;
            for(int k=-1;k<=1;k++)
            {
                for(int m=-1;m<=1;m++)
                {
                    if(j1==j2) 
                    {
                        maxi=Math.max(maxi,grid[i][j1]+f(grid,i+1,k+j1,m+j2,dp));
                     }
                    else{
                     maxi=Math.max(maxi,grid[i][j1]+grid[i][j2]+f(grid,i+1,k+j1,m+j2,dp));
                    }
                }
            }
            
        dp[i][j1][j2] =maxi;
        return dp[i][j1][j2];
    }
}
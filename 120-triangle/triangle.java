class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
    int dp[][]=new int[triangle.size()][triangle.size()];
    
  for(int j=0;j<n;j++)
  {
    dp[n-1][j]=triangle.get(n-1).get(j);
  }
  for(int i=n-2;i>=0;i--)
  {
    for(int j=0;j<=i;j++)
    {
        int left=triangle.get(i).get(j)+dp[i+1][j];
        int right=triangle.get(i).get(j)+dp[i+1][j+1];
        dp[i][j]=Math.min(left,right);
    }
  }
    
    return dp[0][0];
        
        
    }
}
//         public int minimumTotal(int i,int j,List<List<Integer>> arr,int[][] dp) {
//             if(dp[i][j]!=-1) return dp[i][j];
            
//             if (i == arr.size() - 1) {
//             return arr.get(i).get(j);
//         }

//           int left=arr.get(i).get(j)+minimumTotal(i+1,j,arr,dp);
//           int right=arr.get(i).get(j)+minimumTotal(i+1,j+1,arr,dp);
//         dp[i][j]=  Math.min(left,right);
//         return dp[i][j];

        
        
//     }

// }
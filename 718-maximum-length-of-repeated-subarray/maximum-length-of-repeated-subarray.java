class Solution {
    public int findLength(int[] nums1, int[] nums2) {
         int dp[][]=new int[nums1.length+1][nums2.length+1];
        for(int i=0;i<dp.length;i++)
        {
            dp[i][0]=0;
        }
          for(int i=0;i<dp[0].length;i++)
        {
            dp[0][i]=0;
        }
        int max=0;
        for(int i=1;i<dp.length;i++)
        {
            
            for(int j=1;j<dp[0].length;j++)
            {
                int ch1=nums1[i-1];
                int ch2=nums2[j-1];
                if(ch1==ch2)
                {
                    dp[i][j]=1+dp[i-1][j-1];
                    max=Math.max(dp[i][j],max);
                }else{
                    dp[i][j]=0;
                }
                
                
            }
            
            
        }
        return max;
        
    }
}
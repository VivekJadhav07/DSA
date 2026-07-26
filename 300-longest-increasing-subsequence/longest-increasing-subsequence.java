class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[][]=new int[nums.length][nums.length+1];

        for(int []i:dp)
        {
            Arrays.fill(i,-1);
        }
        return fun(0,-1,nums,dp);
        
    }
    public int fun(int i,int prev,int[] nums,int[][] dp)
    {
        if(i>=nums.length) return 0;
        if(dp[i][prev+1]!=-1) return dp[i][prev+1];
        int len=0+fun(i+1,prev,nums,dp);
        
        if(prev==-1 || nums[i]>nums[prev])
        {
            len=Math.max(len,1+fun(i+1,i,nums,dp));
        }
        dp[i][prev+1] =len;
        return dp[i][prev+1];
        
        

    }
}
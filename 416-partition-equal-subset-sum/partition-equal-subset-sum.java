class Solution {
    public boolean canPartition(int[] nums) {
      
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
        }
     if(sum%2!=0) return false;
      int target = sum / 2;
       int dp[][]=new int[nums.length][target+1];
       for(int i[]:dp)
       {
        Arrays.fill(i,-1);
       }
      
        return fun(nums.length-1,target,nums,dp);
        
    }
    public boolean fun(int i,int target,int[] nums,int[][] dp)
    {
        if(target==0) return true;
        if(i==0) return nums[0]==target;
        if(dp[i][target]!=-1) return dp[i][target]==1;

        boolean nottake=fun(i-1,target,nums,dp);
        boolean take=false;
         if(nums[i]<=target)
         {
            take=fun(i-1,target-nums[i],nums,dp);
         }
         if( take||nottake)
         {
            dp[i][target]=1;
         }else{
              dp[i][target]=0;
         }
         return take||nottake;
    }
}
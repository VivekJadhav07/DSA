class Solution {
    public boolean canPartition(int[] nums) {
        
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
        }
       
        if(sum%2!=0) return false;
        int target=sum/2;
         int dp[][]=new int[nums.length][target+1];
         for(int i[]:dp)
         {
            Arrays.fill(i,-1);
         }
        
        
        return fun(nums,nums.length-1,target,dp);
        
    }
    public boolean fun(int[] nums,int i,int target,int [][] dp)
    {
        if(target==0) return true;
        if(i==0) return nums[0]==target;
        if(dp[i][target] != -1) return dp[i][target]==1;
        boolean nottake=fun(nums,i-1,target,dp);
        boolean take=false;
        if(nums[i]<=target)
        {
             take=fun(nums,i-1,target-nums[i],dp);
        }
        dp[i][target]=(take|| nottake)?1:0;
        return take|| nottake;
    }
}
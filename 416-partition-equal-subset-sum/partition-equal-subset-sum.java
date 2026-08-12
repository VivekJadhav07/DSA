class Solution {
    public boolean canPartition(int[] nums) {
         int sum=0;
       for(int i:nums)
       {
        sum+=i;
       }
       if(sum%2!=0) return false;
       int target=sum/2;
       

       boolean dp[][]=new boolean[nums.length][target+1];
      
        for(int i=0;i<nums.length;i++)
        {
            dp[i][0]=true;
        }
          if(nums[0]<=target)
        {
            dp[0][nums[0]]=true;
        }

         for(int i=1;i<nums.length;i++)
         {
            for(int k=1;k<=target;k++)
            {
                 boolean nottake=dp[i-1][k];
        boolean take=false;
         if(nums[i]<=k)
         {
            take=dp[i-1][k-nums[i]];
         }
        
         dp[i][k]= take||nottake;

            }
         }
         return dp[dp.length-1][target];



        
    }
    // public boolean fun(int i,int target,int[] nums,int[][] dp)
    // {
    //     if(target==0) return true;
    //     if(i==0) return nums[0]==target;
    //     if(dp[i][target]!=-1) return dp[i][target]==1;

    //     boolean nottake=fun(i-1,target,nums,dp);
    //     boolean take=false;
    //      if(nums[i]<=target)
    //      {
    //         take=fun(i-1,target-nums[i],nums,dp);
    //      }
    //      if( take||nottake)
    //      {
    //         dp[i][target]=1;
    //      }else{
    //           dp[i][target]=0;
    //      }
    //      return take||nottake;
    // }
}
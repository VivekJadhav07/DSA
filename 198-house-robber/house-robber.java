class Solution {
    public int rob(int[] nums) {
        
           int dp[]=new int[nums.length];
         dp[0]=nums[0];
         int neg=0;
         for(int i=1;i<nums.length;i++)
         {
            int pick=nums[i];
            if(i>1)
            {
                pick+=dp[i-2];
            }
           
            int notpick=0+dp[i-1];
            dp[i]=Math.max(pick,notpick);
         }
         return dp[dp.length-1];
    }
    // public int rob(int[] nums,int[] dp,int i) {

    //     if(i==0) return nums[i];
    //     if(i<0) return 0;
    //     if(dp[i]!=-1) return dp[i];
    //     int pick=nums[i]+rob(nums,dp,i-2);
    //     int notpick=0+rob(nums,dp,i-1);
    //     dp[i]= Math.max(pick,notpick);
           
    //      return dp[i];
    // }
}
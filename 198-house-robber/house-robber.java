class Solution {
    public int rob(int[] nums) {

        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        int min=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            int first=dp[i-1];
            int second=nums[i];
            if(i>1)
            {
                second=nums[i]+dp[i-2];
            }
             
            
            min=Math.max(first,second);
            dp[i]=min;
        }
        return dp[dp.length-1];

        
        
    }
}
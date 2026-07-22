class Solution {
    public int deleteAndEarn(int[] nums) {
            if(nums.length==0)
        {
            return 0;
        }
        if(nums.length==1)
        {
            return nums[0];
        }
        int max=0;
        for(int i:nums)
        {
         max=Math.max(max,i);
        }
        int demo[]=new int[max+1];
            for(int i:nums)
        {
              demo[i]+=i;
        }
        int dp[]=new int[demo.length];
        Arrays.fill(dp,-1);
        dp[0]=demo[0];
        int neg=0;
        int max1=0;
        for(int i=1;i<demo.length;i++)
        {
            int pick=demo[i];
            if(i>1)
            {
                pick+=dp[i-2];
            }
            int notpick=0+dp[i-1];
            dp[i]=Math.max(pick,notpick);
        }
        return dp[dp.length-1];

    }
    
}
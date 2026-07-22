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
      
       
        int prev1=demo[0];
        int prev2=0;
        int max1=0;
        for(int i=1;i<demo.length;i++)
        {
            int pick=demo[i];
            if(i>1)
            {
                pick+=prev2;
            }
            int notpick=0+prev1;
            int curr=Math.max(pick,notpick);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;

    }
    
}
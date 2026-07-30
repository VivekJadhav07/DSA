class Solution {
    public int[] transformArray(int[] nums) {
        int even=0;
        int odd=0;
        for(int i:nums)
        {
            if(i%2==0)
            {
                even+=1;
            }else{
               odd+=1;
            }
        }
        for(int i=0;i<even;i++)
        {
            nums[i]=0;
        }
         for(int i=even;i<even+odd;i++)
        {
            nums[i]=1;
        }
        return nums;
    }
}
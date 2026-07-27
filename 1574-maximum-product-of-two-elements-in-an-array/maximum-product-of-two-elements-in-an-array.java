class Solution {
    public int maxProduct(int[] nums) {
        int max1=0;
        int max2=1;
        if(nums[max2]>nums[max1])
        {
          max1=1;
          max2=0;
         
        }
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i]>nums[max1])
            {
                max2=max1;
                max1=i;
            }
            else  if( nums[i]>nums[max2])
            {
              max2=i;
            }
        }
        return ( ( nums[max1]-1 )*( nums[max2]-1 ));
        
    }
}
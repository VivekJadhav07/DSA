class Solution {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        // for(int i:nums)
        // {
        //     if(i>max1)
        //     {
        //         max1=i;
        //         max2=max1;

        //     }else if(i<max1 && i>max2)
        //     {
        //         max2=i;
        //     }
        // }
        int index=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max1)
            {
                max1=nums[i];
                index=i;
            }
        }
        int index2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max2 && nums[i]<=max1 && i!=index)
            {
                max2=nums[i];
                index2=i;
            }
        }
        return (max1-1)*(max2-1);
    }
}
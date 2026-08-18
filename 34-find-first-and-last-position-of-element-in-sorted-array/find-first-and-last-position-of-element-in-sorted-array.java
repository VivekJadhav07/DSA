class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0)
        {
            return new int[]{-1,-1};
        }

       if(nums.length==1)
       {
        if(target==nums[0] )
        {
        return new int[]{0,0};
        }else{
             return new int[]{-1,-1};
        }
       }
        int first=lowerbound(target,nums);
        int second=uperbound(target,nums);
     if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }


        return new int[]{first,second};

      
 
      
    }

    public int lowerbound(int target,int nums[])
    {
        int idx=nums.length;
        int high=nums.length-1;
        int low=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>=target)
            {
               idx=mid;
               high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return idx;
    }
    public int uperbound(int target,int nums[])
    {
        int idx=nums.length;
        int high=nums.length-1;
        int low=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>target)
            {
               idx=mid;
               high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return idx-1;
    }

   
}
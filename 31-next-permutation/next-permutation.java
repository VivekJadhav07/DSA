class Solution {
    public void nextPermutation(int[] nums) {
        
        int ind=-1;;
       
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
               ind=i;
               break;
            }
        }
        if(ind==-1)
        {
            reverse(0,nums.length-1,nums);
            return;
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]>nums[ind])
            {
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }
        reverse(ind+1,nums.length-1,nums);
         


    }
    public void reverse(int left,int right,int[] nums)
    {
         while(left<right)
          {
            int temp=nums[left];
            nums[left]=nums[right];
               nums[right]=temp;
               left+=1;
               right-=1;
          }

    }
  
}
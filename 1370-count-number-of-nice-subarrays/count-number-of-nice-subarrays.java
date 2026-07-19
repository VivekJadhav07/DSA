class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        return atMostk(nums,k)-atMostk(nums,k-1);

    }
      public int atMostk(int[] nums, int k) {
        
        if(k<0)
        {
            return 0;
        }
    
        int l=0;
        int sum=0;
        int count=0;
        for(int r=0;r<nums.length;r++)
        {
            sum+=nums[r]%2;
            while(sum>k)
            {
                sum-=nums[l]%2;
                l+=1;
            }
            count+=(r-l+1);
        }
        return count;
        
    }
}
class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0;
        int l=0;
        int r=0;
        int max=0;
        while(r<nums.length)
        {
          
            if(nums[r]==0)
            {
                count+=1;
            }
            while(count>k)
            {
                
                if(nums[l]==0) count-=1;
                l+=1;
            }
            max=Math.max(max,r-l+1);
            r+=1;
           
           
        }
           
        return max;
        
    }
}
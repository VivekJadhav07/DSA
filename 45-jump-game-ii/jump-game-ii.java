class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int l=0;
        int r=0;
        while(r<nums.length-1)
        {
            int max=0;
            for(int i=l;i<=r;i++)
            {
                max=Math.max(max,nums[i]+i);
            }
            l=r+1;
            r=max;
            jump=jump+1;
        }
        return jump;
      
   
    }
     

}
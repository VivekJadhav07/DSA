class Solution {
    public int jump(int[] nums) {
        int r=0;
        int l=0;
        int max=0;
        int jump=0;
        while(r<nums.length-1)
        {
            for(int i=l;i<=r;i++)
            {
              
                
                 if(nums[i]+i>max)
                 {
                   max=Math.max(max,nums[i]+i);
                 }
                


            }
              l=r+1;
              r=max;
             jump+=1;
        }
        return jump;
   
    }
     

}
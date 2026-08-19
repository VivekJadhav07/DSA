class Solution {
    public boolean canJump(int[] nums) {
     int k=0;
     int maxJump=0;
      for(int i=0;i<nums.length;i++)
      {
        if(k>maxJump) return false;
        maxJump=Math.max(maxJump,k+nums[i]);
        k+=1;
      }
       return true;
       
        
    }
}
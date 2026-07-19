class Solution {
    public double findMaxAverage(int[] nums, int k) {
       
       if(nums.length==0 || nums.length<k || k<=0 )
       {
        return 0;
       }
       int currentSum=0;
       for(int i=0;i<k;i++)
       {
        currentSum+=nums[i];
       }
       int maxSum=currentSum;
       for(int i=k;i<nums.length;i++)
       {
        currentSum=currentSum - nums[i-k] + nums[i];
        maxSum=Math.max(currentSum,maxSum);
       }
       return (double) maxSum/k;

    }
}
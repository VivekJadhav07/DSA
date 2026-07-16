class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=0;
        int sum=0;
        int p=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];

        }
         max=sum;
        for(int i=k;i<nums.length;i++)
        {
            sum-=nums[p];
            sum+=nums[i];
            p+=1;
            max=Math.max(max,sum);

        }
        return (double) max/k;
    }
}
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=Integer.MIN_VALUE;
        while(left<right)
        {
            if(height[left]<height[right])
            {
               max=Math.max(max,(right-left)*height[left]);
               left+=1;
            }else{
                max=Math.max(max,(right-left)*height[right]);
                right-=1;

            }
        }
        return max;
        
    }
}
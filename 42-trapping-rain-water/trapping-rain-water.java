class Solution {
    public int trap(int[] height) {
  int prefixMax[]=new int[height.length];

     prefixMax[0]=height[0];

     for(int i=1;i<height.length;i++)
     {
        prefixMax[i]=Math.max(prefixMax[i-1],height[i]);
     }
     int suffix[]=new int[height.length];

     suffix[height.length-1]=height[height.length-1];

     for(int i=height.length-2;i>=0;i--)
     {
        suffix[i]=Math.max(suffix[i+1],height[i]);
     }
  int total=0;
        for(int i=0;i<height.length;i++)
        {
            int  left=prefixMax[i];
            int right=suffix[i];

            if(height[i]<left && height[i]<right)
            {
                total+=Math.min(left,right)-height[i];
            }
           
          

        }
         return total;
        
    }

    

}
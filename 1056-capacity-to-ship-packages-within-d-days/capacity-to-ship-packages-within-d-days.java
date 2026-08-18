class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE;
        int sum=0;
    
      
        for(int i:weights)
        {   
            sum+=i;
            max=Math.max(i,max);
        }
        // for(int i=max;i<=sum;i++)
        // {
        //     int day=fun(weights,i);
        //     if(day<=days)
        //     {
        //         return i;
        //     }
        // }
        int low=max;
        int high=sum;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(fun(weights,mid)<=days)
            {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;

    }
    
    public int fun(int[] weights,int capasity)
    {
      
        
        int load=0;
        int day=1;

        for(int i=0;i<weights.length;i++)
        {
            if(load+weights[i]>capasity)
            {
                day+=1;
                load=weights[i];

            }else{
                load+=weights[i];
            }

        }
        return day;

    }
}
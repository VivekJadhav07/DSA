class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int p=0;
        int sum=0;
        int avg=0;
        int count=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
         avg=sum/k;
        if(avg>=threshold)
        {
            count+=1;
        }
        for(int i=k;i<arr.length;i++)
        {
            sum+=arr[i];
            sum-=arr[p];
            p+=1;
            avg=sum/k;
            if(avg>=threshold)
            {
                count+=1;
            }
        }
        return count;
        
    }
}
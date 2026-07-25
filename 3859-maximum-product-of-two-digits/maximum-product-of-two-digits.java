class Solution {
    public int maxProduct(int n) {
         if (n == 0) return 0;
         int max1=-1;
          int max2=-1;
       
   int num=n;
        while(num>0)
        {
            int rem=num%10;
           if(rem>=max1)
           {
            max2=max1;
            max1=rem;
           }else if(rem>max2)
           {
            max2=rem;
           }
           
            num=num/10;
           
        }
        return max1*max2;
        
    }
}
class Solution {
    public int findGCD(int[] nums) {
       
      int b=Integer.MIN_VALUE;
      int a=Integer.MAX_VALUE;
      for(int i:nums)
      {
        a=Math.min(a,i);
        b=Math.max(b,i);
      }
      while(a>0 && b>0)
      {
        if(a>b)
        {
            a=a%b;
        }else{
            b=b%a;
        }
      }
        return (a==0)?  b: a;
    }
}
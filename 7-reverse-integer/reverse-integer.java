class Solution {

    public int reverse(int x) {
      long  num=x;
      long rem=0;
      long rev=0;
       while(num!=0)
       {
         rem=num%10;
         rev=rev*10+rem;
         num=num/10;


       }
       if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
       {
        return 0;
       }
       return (int)rev;
    
    }
}
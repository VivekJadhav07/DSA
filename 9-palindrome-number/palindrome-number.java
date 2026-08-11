class Solution {
    public boolean isPalindrome(int x) {
         int num=Math.abs(x);
         int rev=0;
         int rem=0;
         while(num!=0)
         {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
         }
         if(x==rev)
         {
            return true;
         }
         return false;
    }
}
class Solution {
    public boolean isPalindrome(String s) {

       String s1=s.toLowerCase();
       String str="";
       for(char ch:s1.toCharArray())
       {
        if(( ch>='a' && ch<='z' ) || (ch>='0' && ch<='9'))
        {
            str+=ch;
        }
       }
      int left=0;
      int right=str.length()-1;
      while(left<right)
      {
        if(str.charAt(left)!=str.charAt(right))
        {
            return false;
        }
        left+=1;
        right-=1;

      }
      return true;

    }
}
class Solution {
    public boolean isPalindrome(String s) {

       String s1=s.toLowerCase(); 
       String s2="";
       for(char ch:s1.toCharArray())
       {
          if ( (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
          {
           s2+=ch;
          }
       }
       StringBuilder sb=new StringBuilder(s2);
       String s3=sb.reverse().toString();
       return s2.equals(s3);
    }
}
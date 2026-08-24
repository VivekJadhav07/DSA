class Solution {
    public int longestPalindromeSubseq(String s) {
     
     int dp[][]=new int[s.length()+1][s.length()+1];
    
    for(int i=0;i<=s.length();i++)
    {
        dp[0][i]=0;
        dp[i][0]=0;

    }
     String s1=new StringBuilder(s).reverse().toString();


        for(int i=1;i<=s.length();i++)
        {
            for(int j=1;j<=s1.length();j++)
            {
               char ch1=s.charAt(i-1);
               char ch2=s1.charAt(j-1);
               if(ch1==ch2)
               {
                dp[i][j]=1+dp[i-1][j-1];
               }else{
               int left=dp[i-1][j];
               int right=dp[i][j-1];
               dp[i][j]=Math.max(left,right);
               }
            }
        }

      return dp[dp.length-1][dp[0].length-1];
     
        
    }
    


}
class Solution {
    public int longestPalindromeSubseq(String s) {
     
     int dp[][]=new int[s.length()][s.length()];
     for(int i[]:dp)
     {
        Arrays.fill(i,-1);
     }
     String s1=new StringBuilder(s).reverse().toString();




      return fun(s.length()-1,s1.length()-1,s,s1,dp);
     
        
    }
    public int fun(int i,int j,String s1,String s2,int[][] dp)
    {
       if(i<0 || j<0) return 0;
      if(i==0 || j==0 )
      {
        if(s1.charAt(i)==s2.charAt(j))
        {
            return 1;
        }
      }
      if(dp[i][j]!=-1) return dp[i][j];

 
      char ch1=s1.charAt(i);
      char ch2=s2.charAt(j);
      if(ch1==ch2)
      {
        dp[i][j]= 1+fun(i-1,j-1,s1,s2,dp);
        return dp[i][j];
      }
      int left=fun(i-1,j,s1,s2,dp);
      int right=fun(i,j-1,s1,s2,dp);
      dp[i][j]= Math.max(left,right);
      return dp[i][j];




    }


}
class Solution {
    public boolean isMatch(String s, String p) {

         int  dp[][]=new int[s.length()][p.length()];
         for(int i[]:dp)
         {
              Arrays.fill(i,-1);
         }
        return fun(s.length()-1,p.length()-1,s,p,dp);
        
    }

    public boolean fun(int i,int j,String s,String p,int[][] dp)
    {
        if(i< 0 && j<0 ) return true;
        if(i<0 && j>=0) return star(p,j);
        if(j<0 && i>=0) return false;
        if(dp[i][j]!=-1) 
        {
            if(dp[i][j]==1)
            {
                return true;
            }else{
                return false;
            }
        }

        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?')
        {
            if( fun(i-1,j-1,s,p,dp) )
            {
                dp[i][j]=1;
            } else{
                dp[i][j]=0;
            }
        }
        else if(p.charAt(j)=='*')
        {
            if( fun(i-1,j,s,p,dp)||fun(i,j-1,s,p,dp))
            {
                dp[i][j]=1;
            }
            else{
                dp[i][j]=0;
            }
        }else{
            dp[i][j]= 0;
        }
        return dp[i][j] == 1;

    }

    public boolean star(String p,int i)
    {
        for(int j=0;j<=i;j++)
        {
            if(p.charAt(j)!='*')
            {
                return false;
            }
        }
        return true;
    }
}
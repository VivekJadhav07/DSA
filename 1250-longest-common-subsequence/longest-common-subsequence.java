class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()][text2.length()];
       for(int []i:dp)
       {
        Arrays.fill(i,-1);
       }
        return fun(text1.length()-1,text2.length()-1,text1,text2,dp);
        
    }
    public  int fun(int i,int j,String text1,String text2,int[][] dp)
    {
           if(i<0 ||j<0) return 0;
           if(dp[i][j]!=-1) return dp[i][j];
           
            char ch1=text1.charAt(i);
            char ch2=text2.charAt(j);
           if(ch1==ch2)
           {
              return 1+fun(i-1,j-1,text1,text2,dp);
           }
            
            
             dp[i][j]= Math.max(  fun(i-1,j,text1,text2,dp),fun(i,j-1,text1,text2,dp));
             return dp[i][j];

           
         
           

            
           
    }
}
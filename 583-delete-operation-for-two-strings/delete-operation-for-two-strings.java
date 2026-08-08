class Solution {
    public int minDistance(String word1, String word2) {
          int dp[][]=new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<dp.length;i++)
        {
            dp[i][0]=0;
        }
        for(int i=0;i<dp[0].length;i++)
        {
            dp[0][i]=0;
        }
        
        for(int i=1;i<dp.length;i++)
        {
                for(int j=1;j<dp[0].length;j++)
            {
                char ch1=word1.charAt(i-1);
                char ch2=word2.charAt(j-1);
                if(ch1==ch2)
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
                
            }

        }

        int insert= word1.length()-dp[dp.length-1] [dp[0].length-1];
        int delete= word2.length()-dp[dp.length-1] [dp[0].length-1];

        return insert+delete;

        
    }
}
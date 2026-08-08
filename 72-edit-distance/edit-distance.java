class Solution {
    public int minDistance(String word1, String word2) {
        int dp[][]=new int[word1.length()+1][word2.length()+1];
        for(int i[]:dp)
        {
                Arrays.fill(i,-1);
        }
        return fun(word1.length()-1,word2.length()-1,word1,word2,dp);
        
    }

    public int fun(int i,int j,String word1,String word2,int[][] dp)
    {
       if(i<0) return j+1;
       if(j<0) return i+1;
       if(dp[i][j]!=-1) return dp[i][j];
       char ch1=word1.charAt(i);
       char ch2=word2.charAt(j);
       if(ch1==ch2)
       {
        return fun(i-1,j-1,word1,word2,dp);
       }

       int insert=1+fun(i,j-1,word1,word2,dp);
       int delete=1+fun(i-1,j,word1,word2,dp);
       int replace=1+fun(i-1,j-1,word1,word2,dp);

       dp[i][j]= Math.min(insert, Math.min(delete,replace) );

         return dp[i][j];

    }
}
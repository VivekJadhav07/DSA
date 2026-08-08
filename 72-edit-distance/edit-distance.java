class Solution {
    public int minDistance(String word1, String word2) {
        int dp[][]=new int[word1.length()+1][word2.length()+1];
       
            for(int j=0;j<dp.length;j++)
            {
            dp[j][0]=j;
            
            
            }
             for(int i=0;i<dp[0].length;i++)
        {
            dp[0][i]=i;

        }
        
             
             for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                char ch1=word1.charAt(i-1);
                char ch2=word2.charAt(j-1);
                if(ch1==ch2)
                {
                    dp[i][j]=dp[i-1][j-1];
                }else{

                  int insert=1+dp[i][j-1];
                  int delete=1+dp[i-1][j];
                  int replace=1+dp[i-1][j-1];

                  dp[i][j]=Math.min(insert,Math.min(delete,replace));


                }
           
            }
        }

        return dp[dp.length-1][dp[0].length-1];



        
        
    }

    // public int fun(int i,int j,String word1,String word2,int[][] dp)
    // {
    //    if(i<0) return j+1;
    //    if(j<0) return i+1;
    //    if(dp[i][j]!=-1) return dp[i][j];
    //    char ch1=word1.charAt(i);
    //    char ch2=word2.charAt(j);
    //    if(ch1==ch2)
    //    {
    //     return fun(i-1,j-1,word1,word2,dp);
    //    }

    //    int insert=1+fun(i,j-1,word1,word2,dp);
    //    int delete=1+fun(i-1,j,word1,word2,dp);
    //    int replace=1+fun(i-1,j-1,word1,word2,dp);

    //    dp[i][j]= Math.min(insert, Math.min(delete,replace) );

    //      return dp[i][j];

    // }
}
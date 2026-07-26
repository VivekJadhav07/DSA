class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()+1][text2.length()+1];
        for(int i=0;i<=text1.length();i++)
        {
            dp[i][0]=0;
        }
            for(int i=0;i<=text2.length();i++)
        {
            dp[0][i]=0;
        }
    //     for(int []i:dp)
    //     {
    //         Arrays.fill(i,-1);
    //     }
    //   int i1=text1.length()-1;
    //   int i2=text2.length()-1;
    //     return fun(i1,i2,text1,text2,dp);
    for(int i1=1;i1<=text1.length();i1++)
    {
        for(int i2=1;i2<=text2.length();i2++)
        {
        int s1=text1.charAt(i1-1);
        int s2=text2.charAt(i2-1);
        if(s1==s2) {
        dp[i1][i2]= 1+dp[i1-1][i2-1];
        }else{

           dp[i1][i2] = Math.max(dp[i1-1][i2],dp[i1][i2-1]);

        }
        

        }
        
    }
    return dp[text1.length()][text2.length()];
        
    }
//     public int fun(int i1,int i2,String text1,String text2,int[][] dp)
//     {
//         if(i1<0 || i2<0) return 0;
//         if(dp[i1][i2]!=-1) return dp[i1][i2];
//         int s1=text1.charAt(i1);
//         int s2=text2.charAt(i2);
//         if(s1==s2) {
//         dp[i1][i2]= 1+fun(i1-1,i2-1,text1,text2,dp);
//         }else{

//            dp[i1][i2] = Math.max(fun(i1-1,i2,text1,text2,dp),fun(i1,i2-1,text1,text2,dp));

//         }
//         return dp[i1][i2];



//     }
// }
}
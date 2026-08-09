class Solution {
    public int findCircleNum(int[][] isConnected) {
        int m=isConnected.length;
      
        Deque<int[]> deque=new ArrayDeque<>();
        boolean[] visited=new boolean[m];
        int count=0;
       
        for(int i=0;i<m;i++)
        {
           
                if(visited[i]==false)
                {
                    dfs(i,isConnected,visited);
                    count+=1;
                }

            
        }
        return count;
        
    }

    public void dfs(int i,int[][] isConnected,boolean[] visited)
    {
     
       visited[i]=true;
       for(int k=0;k<isConnected[0].length;k++)
       {
        if(!visited[k] && isConnected[i][k]==1) 
        {    

            visited[k]=true;
            dfs(k,isConnected,visited);
        }
       }



    }
}
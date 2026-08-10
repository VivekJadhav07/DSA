class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int V=graph.length;
    
       
        int[] color=new int[V];
        Arrays.fill(color,-1);
     
          for(int i=0;i<color.length;i++)
          {
             if(color[i]==-1)
             {
                  if(dfs(i,color,graph)==false)
                  {
                    return false;
                  }
             }
          }
        return true;

    }

    public boolean dfs(int start,int[] color,int[][] graph)
    {
           
           
            int node=start;
           
            
          
            for(int i:graph[node])
            {
              if(color[i]==-1)
              {
                if(color[node]==0)
                {
                    color[i]=1;
                    if(!dfs(i,color,graph))
                    {
                        return false;
                    }
                  
                }else{
                    color[i]=0;
                         if(!dfs(i,color,graph))
                    {
                        return false;
                    }
                  
                }
              }else if(color[i]==color[node]){
                return false;
              }


            }



        
        return true;
        
        



    }

}
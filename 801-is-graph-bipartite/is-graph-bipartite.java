class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int V=graph.length;
    
       
        int[] color=new int[V];
        Arrays.fill(color,-1);
     
          for(int i=0;i<color.length;i++)
          {
             if(color[i]==-1)
             {
                  if(bfs(i,color,graph)==false)
                  {
                    return false;
                  }
             }
          }
        return true;

    }

    public boolean bfs(int start,int[] color,int[][] graph)
    {
        Deque<Integer> deque=new ArrayDeque<>();
         deque.offer(start);
    
        while(!deque.isEmpty())
        {
           
           
            int node= deque.poll();
            
          
            for(int i:graph[node])
            {
              if(color[i]==-1)
              {
                if(color[node]==0)
                {
                    color[i]=1;
                    deque.offer(i);
                }else{
                    color[i]=0;
                    deque.offer(i);
                }
              }else if(color[i]==color[node]){
                return false;
              }


            }



        }
        return true;
        
        



    }

}
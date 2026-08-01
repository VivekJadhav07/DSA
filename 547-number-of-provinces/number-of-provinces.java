class Solution {
    public int findCircleNum(int[][] isConnected) {
     ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
     for(int i=0;i<isConnected.length;i++)
     {
        adj.add(new ArrayList<Integer>());
     }
     for(int i=0;i<isConnected.length;i++)
     {
        for(int j=0;j<isConnected[i].length;j++)
        {
            if(isConnected[i][j]==1 && i!=j)
            {
            adj.get(i).add(j);
            adj.get(j).add(i);
            }
        }
     }
     Deque<Integer> queue=new ArrayDeque<>();

     int count=0;
     boolean visited[]=new boolean[adj.size()];
     for(int i=0;i<visited.length;i++)
     {
        if(visited[i]==false)
        {
            count+=1;
            bfs(i,queue,visited,adj);
           
           
        }
     }
     return count;
       
    }
    public void bfs(int i,Deque<Integer> queue,boolean[] visited,ArrayList<ArrayList<Integer>> adj)
    {
        queue.offer(i);
        visited[i]=true;
        while(!queue.isEmpty())
        {
            int node=queue.poll();
            for(int k:adj.get(node))
            {
                if(visited[k]==false)
                {
                    queue.offer(k);
                    visited[k]=true;
                }
            }
         

        }
    }
}
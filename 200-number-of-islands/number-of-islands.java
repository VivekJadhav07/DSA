class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean visited[][]=new boolean[m][n];
        Deque<int[]> queue=new ArrayDeque<>();
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(visited[i][j]==false && grid[i][j]=='1')
                {
                    bfs(i,j,grid,queue,visited);
                    count+=1;

                }
            }
        }

        return count;
        
    }

    public void bfs(int i,int j,char[][] grid,Deque<int[]> queue,boolean[][] visited)
    {
        int m=grid.length;
        int n=grid[0].length;
       int[] dr={-1,0,1,0};
       int[] dc={0,1,0,-1};
       queue.offer(new int[]{i,j});
       while(!queue.isEmpty())
       {
         int []curr=queue.poll();
         int row=curr[0];
         int col=curr[1];

          for(int k=0;k<4;k++)
          {
            int rc=row+dr[k];
            int cc=col+dc[k];
            if(rc>=0 && rc<m&& cc>=0 && cc<n && visited[rc][cc]==false && grid[rc][cc]=='1')
            {
                visited[rc][cc]=true;
                queue.offer(new int[]{rc,cc});
            }
          }




       }





    }
}
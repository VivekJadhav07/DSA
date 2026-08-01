class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        boolean visited[][]=new boolean[n][m];
        Deque<int[]> queue=new ArrayDeque<>();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                 if(visited[i][j]==false && grid[i][j]=='1')
                 {
                    bfs(i,j,queue,visited,grid);
                    count+=1;
                 }

            }
        }
        return count;
    }
    public void bfs(int i,int j,Deque<int[]> queue,boolean[][] visited,char[][] grid)
    {
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        int row=grid.length;
        int col=grid[0].length;
        queue.offer(new int[]{i,j});
        while(!queue.isEmpty())
        {
         int[] curr=queue.poll();
         int r=curr[0];
         int c=curr[1];
            
            for(int k=0;k<4;k++)
            {
                int rc=r+dr[k];
                int cc=c+dc[k];
                if(rc>=0 && rc<row && cc>=0 && cc<col && visited[rc][cc]==false && grid[rc][cc]=='1')

                {
                    visited[rc][cc]=true;
                    queue.offer(new int[]{rc,cc});
                }
            }

        }


    }
}
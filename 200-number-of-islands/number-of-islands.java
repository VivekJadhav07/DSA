class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        boolean[][] visited=new boolean[row][col];
        Deque<int[]> queue=new ArrayDeque<>();
        int count=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(visited[i][j]==false && grid[i][j]=='1')
                {
                    count+=1;
                    bfs(i,j,grid,visited,queue);
                }
            }
        }
        return count;

    }

    public void bfs(int row,int col, char [][]grid,boolean[][] visited,Deque<int[]> queue)
    {
        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};
      int n=grid.length;
      int m=grid[0].length;
        queue.offer(new int[]{row,col});
        visited[row][col]=true;
       while(!queue.isEmpty())
       {
           int[] curr=queue.poll();
           int r=curr[0];
           int c=curr[1];

           for(int k=0;k<4;k++)
           {
            int rc=r+dr[k];
            int cc=c+dc[k];
            if(rc>=0 && rc<n && cc>=0 && cc<m && visited[rc][cc]==false && grid[rc][cc]=='1')
            {
                visited[rc][cc]=true;
                queue.offer(new int[]{rc,cc});
            }

           }

       }




    }
}
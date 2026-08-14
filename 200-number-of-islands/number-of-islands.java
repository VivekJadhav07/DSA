class Solution {
    public int numIslands(char[][] grid) {
     
     int count=0;
      for(int i=0;i<grid.length;i++)
      {
          for(int j=0;j<grid[0].length;j++)
          {
            if(grid[i][j]=='1')
            {
                count+=1;
                 bfs(i,j,grid);
            }
          }
      }
      
     return count;

        
    }
    public void bfs(int r,int c,char[][] grid)
    {
    Deque<int[]> deque=new ArrayDeque<>();
    deque.offer(new int[]{r,c});
    int[] dr={-1,0,1,0};
    int[] dc={0,1,0,-1};
    while(!deque.isEmpty())
    {
        int curr[]=deque.poll();
        int row=curr[0];
        int col=curr[1];
        for(int i=0;i<4;i++)
        {
          int rc=row+dr[i];
          int cc=col+dc[i];
          if(rc>=0 && rc<grid.length && cc>=0 && cc<grid[0].length && grid[rc][cc]=='1')
          {
               grid[rc][cc]=0;
               deque.offer(new int[]{rc,cc});
          }


        }




    }



    }
}
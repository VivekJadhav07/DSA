class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int fresh=0;
        Deque< int[]> deque=new ArrayDeque<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                   fresh+=1; 
                }
                 if(grid[i][j]==2)
                {
                   deque.offer(new int[]{i,j});
                }
            }
        }
       
        
    
        int []dr={-1,0,1,0};
        int []dc={0,1,0,-1};
         int time=0;

        while(!deque.isEmpty())
        {
            int size=deque.size();
            boolean rotten=false;
            for(int k=0;k<size;k++)
            {
         int[] curr=deque.poll();
         int row=curr[0];
         int col=curr[1];
         
         
           for(int i=0;i<4;i++)
           {
              int rc=row+dr[i];
              int cc=col+dc[i];
              if(rc>=0 && rc<m && cc>=0 && cc<n &&
              grid[rc][cc]==1 
              )
              {
                rotten=true;
                fresh-=1;
               deque.offer(new int[]{rc,cc});
                grid[rc][cc]=2;
              }


           }
            }
           if(rotten==true)
           {
            time+=1;
           }
           
         
        }
        if(fresh>0)
        {
            return -1;
        }
       
      

           return time;
        
    }

    // public int bfs(fresh,grid,deque,visited)
    // {
    //     int m=grid.length;
    //     int n=grid[0].length;
        
    // }
}
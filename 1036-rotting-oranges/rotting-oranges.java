class Solution {
   
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Deque< int[]> queue=new ArrayDeque<>();
        int fresh=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                  queue.offer(new int[]{i,j});
                 
                   
                }else if(grid[i][j]==1)
                {
                    fresh++;

                }
            }
        }
        if(fresh==0)
        {
            return 0;
        }
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        int time=0;
    while( !queue.isEmpty() )
    {
        int size=queue.size();
        boolean rotten=false;
        for(int i=0;i<size;i++)
        {
            int curr[]=queue.poll();
            int row=curr[0];
            int col=curr[1];
            for(int k=0;k<4;k++)
            {
                int rc=row+dr[k];
                int cc=col+dc[k];
                if(rc>=0 && rc<n && cc>=0 && cc<m && grid[rc][cc]==1)
                {
                    grid[rc][cc]=2;
                    rotten=true;
                    fresh--;
                    queue.offer(new int[]{rc,cc});
                }

            }

        }
        if(rotten)
        {
            time+=1;
        }
    }
    
    if(fresh==0)
    {
        return time;
    }else{
        return -1;
    }

         
        
    }

    
}
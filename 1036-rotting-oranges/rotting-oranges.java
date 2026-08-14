class Solution {
    public int orangesRotting(int[][] grid) {

        int fresh=0;
        Deque<int []> deque=new ArrayDeque<>();
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
               if(grid[i][j]==2)
               {
                deque.offer(new int[]{i,j});
               }
               else if(grid[i][j]==1)
               {
                fresh+=1;
               }
            }
        }
        if(fresh==0)
        {
            return 0;
        }
       int time=0;
        while(!deque.isEmpty())
        {
            int size=deque.size();
           
            int m=grid.length;
            int n=grid[0].length;
            boolean rotten=false;
            for(int k=0;k<size;k++)
            {
            int curr[]=deque.poll();
            int row=curr[0];
            int col=curr[1];
              for(int i=0;i<4;i++)
              {
                int rr=row+dr[i];
                int cc=col+dc[i];
                if(rr>=0 && rr<m && cc>=0 && cc<n && grid[rr][cc]==1)
                {
                    grid[rr][cc]=2;
                    deque.offer(new int[]{rr,cc});
                    fresh-=1;
                    rotten=true;
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
        }
        return -1;


        
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int fresh=0;

        Deque<int[]> deque=new ArrayDeque<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    deque.offer(new int[]{i,j});
                }else if(grid[i][j]==1)
                {
                    fresh+=1;
                }
            }
        }
        if(fresh==0)
        {
            return 0;
        }
        int count=0;
        while(!deque.isEmpty())
        {
            int dr[]={-1,0,1,0};
            int dc[]={0,1,0,-1};
            int size=deque.size();
              boolean rotten=false;
            for(int k=0;k<size;k++)
            {
             int curr[]=deque.poll();
             int r=curr[0];
             int c=curr[1];
           
               for(int i=0;i<4;i++)
               {

                int rc=r+dr[i];
                int cc=c+dc[i];
                if(rc>=0 && rc<grid.length && cc>=0 && cc<grid[0].length
                 &&
               grid[rc][cc]==1
                
                )
                {
                     deque.offer(new int[]{rc,cc});
                     grid[rc][cc]=2;
                     fresh-=1;
                     rotten=true;
                }

               }

               
            }
            if(rotten)
               {
                count+=1;
               }


        }
        if(fresh==0)
        {
            return count;
        }
        return -1;

        
    }
}
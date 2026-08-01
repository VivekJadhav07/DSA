class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int ini=image[sr][sc];
        if(ini == color)
        {
            return image;
        }
        Deque<int[]> queue=new ArrayDeque<>();
        queue.offer( new int[]{ sr , sc } );
        image[sr][sc] = color;
        int []dr={-1,0,1,0};
        int[]dc={0,1,0,-1};
        while( !queue.isEmpty() )
        {
            int[] curr=queue.poll();
            int row=curr[0];
            int col=curr[1];
            for(int i=0;i<4;i++)
            {
                int rc=row+dr[i];
                int cc=col+dc[i];
                if( rc>=0 && rc<n && cc>=0 && cc<m && image[rc][cc]==ini )
                {
                    image[rc][cc]=color;
                    queue.offer(new int[]{rc,cc});
                }

            }
        }
        return image;
        
    }
}
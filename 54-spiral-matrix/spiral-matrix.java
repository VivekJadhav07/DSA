class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     ArrayList<Integer> list=new ArrayList<>();
     int top=0;
     int left=0;
//vivek
     int bottom=matrix.length-1;
     int right=matrix[0].length-1;
     while(top<=bottom && left<=right)
     {
        for(int i=left;i<=right;i++)
        {
            list.add(matrix[top][i]);
        }
        top+=1;

          for(int i=top;i<=bottom;i++)
        {
            list.add(matrix[i][right]);
        }
        right-=1;
      if(top<=bottom)
      {
         for(int i=right;i>=left;i--)
        {
            list.add(matrix[bottom][i]);
        }
        bottom-=1;
      }
      if(left<=right)
      {
         for(int i=bottom;i>=top;i--)
        {
            list.add(matrix[i][left]);
        }
        left+=1;
      }


     }
     return list;
        
    }
}
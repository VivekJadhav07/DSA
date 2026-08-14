class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list=new ArrayList<>();
        int k=0;
        while(k<intervals.length && newInterval[0]>intervals[k][1])
        {
           list.add(intervals[k]);
           k+=1;
        }
          while(k<intervals.length && newInterval[1]>=intervals[k][0])
        {
           newInterval[0]=Math.min(intervals[k][0],newInterval[0]);
           newInterval[1]=Math.max(intervals[k][1],newInterval[1]);
           k+=1;
        }
        list.add(new int[]{newInterval[0],newInterval[1]});
         while(k<intervals.length)
        {
           list.add(intervals[k]);
           k+=1;
        }
        int res[][]=new int[list.size()][2];
       for(int i=0;i<list.size();i++)
       {
         res[i]=list.get(i);  

       }
       return res;
       

    }

}
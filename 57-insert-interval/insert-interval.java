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
           newInterval[0]=Math.min(newInterval[0],intervals[k][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[k][1]);
            k+=1;
        }
        list.add(new int[]{newInterval[0],newInterval[1]});
           while(k<intervals.length )
        {
            list.add(intervals[k]);
            k+=1;
        }
        int arr[][]=new int[list.size()][2];
        for(int i=0;i<list.size();i++)
        {
            int temp[]=list.get(i);
            arr[i][0]=temp[0];
            arr[i][1]=temp[1];

        }
        return arr;

    }
}
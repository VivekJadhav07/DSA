class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res=new ArrayList<>();
        int n=intervals.length;
        int i=0;
        //left
        while(i<n && intervals[i][1]<newInterval[0])
        {
        res.add(intervals[i]);
          i+=1;
        }
        // int min=intervals[i][0];
        // int max=intervals[i][1];
        while(i<n && intervals[i][0]<=newInterval[1])
        {
                newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
                newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
                i+=1;
        }
        res.add(new int[]{newInterval[0],newInterval[1]});

        while(i<n )
        {
            res.add(intervals[i]);
            i+=1;
        }
return res.toArray(new int[res.size()][2]);

    }
}
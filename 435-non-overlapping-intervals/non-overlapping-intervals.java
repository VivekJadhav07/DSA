class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
      Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int k=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<intervals.length;i++)
        {
            int start1=intervals[i][0];
            int finish1=intervals[i][1];
            if(start1>=k)
            {
               
                k=finish1;

            }else{
                count+=1;
            }

        }
        return count;
        
    }
}
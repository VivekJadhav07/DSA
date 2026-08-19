class Solution {
    //just use n meeatings in one room
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int last=Integer.MIN_VALUE;
        int count=0;

        for(int i[]:intervals)
        {
            int s=i[0];
            int e=i[1];
            if(s>=last)
            {
                
                last=e;
            }else{
                count+=1;
            }
        }
        return count;
      
    }
}
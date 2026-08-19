class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> list=new ArrayList<>();

        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i[]:intervals)
        {
            int s=i[0];
            int e=i[1];
            if(s<=end)
            {
                end=Math.max(end,e);
            }else{
               list.add(new int[]{start,end});
               start=s;
               end=e;

            }
        }
        list.add(new int[]{start,end});

        int mat[][]=new int[list.size()][2];
        for(int i=0;i<list.size();i++)
        {
            int k[]=list.get(i);
            mat[i][0]=k[0];
            mat[i][1]=k[1];

        }

        
        return mat;


        
    }
}
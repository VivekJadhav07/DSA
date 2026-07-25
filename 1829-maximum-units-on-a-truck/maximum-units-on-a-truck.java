class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int s=truckSize;
        int total=0;
       for(int i=0;i<boxTypes.length;i++)
       {

         if(boxTypes[i][0]<=s)
         {
            total+=boxTypes[i][0]*boxTypes[i][1];
            s-=boxTypes[i][0];
         }else{
           total += boxTypes[i][1] * s;
            break;
         }

       }
       return total;
        
    }
}
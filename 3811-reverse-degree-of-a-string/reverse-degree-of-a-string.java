class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int i=1;
        for(char ch:s.toCharArray())
        {
            int a=27-(ch-'a'+1);
             sum+=a*i;
            i+=1;

        }
        return sum;
        
    }
}
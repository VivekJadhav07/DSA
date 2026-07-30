class Solution {
    public int minimumPushes(String word) {

         int count=0;
         int mul=1;
        for(int i=0;i<word.length();i++)
        {
            if(i!=0 &&  i%8==0)
            {
                mul+=1;
            }
            count+=mul;
        }
        return count;
        
    }
}
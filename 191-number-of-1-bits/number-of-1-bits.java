class Solution {
    public int hammingWeight(int n) {
        
        String s=Integer.toBinaryString(n);
           int count=0;
        for(char i :s.toCharArray())
        {
            if(i=='1')
            {
                   count+=1;
            }
        }
        return count;
    }
}
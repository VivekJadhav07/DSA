class Solution {
    public int maxVowels(String s, int k) {
        int p=0;
        int max=0;
       int count=0;
        for(int i=0;i<k;i++)
        {
            char str=s.charAt(i);
             
           if(isVowel(str))
           {
            count+=1;
           }
        }
        max=count;
           
        for(int i=k;i<s.length();i++)
        {
            char str=s.charAt(i-k);
             char str1=s.charAt(i);
             if(isVowel(str))
             {
                count-=1;
             }
               if(isVowel(str1))
             {
                count+=1;
             }
            
            max=Math.max(max,count);
        }
        return max;

    }
    public boolean isVowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
}
}
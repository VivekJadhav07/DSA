class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashSet<Character> set=new HashSet<>();
         int l=0;
         int len=0;
         for(int r=0;r<s.length();r++)
         {
            char ch=s.charAt(r);
            while(set.contains(ch))
                {   
                        
                        set.remove(s.charAt(l));
                     l+=1;
                  
                }
                set.add(ch);
                len=Math.max(len,r-l+1);
         }
         return len;
    }
}
class Solution {
    public boolean rotateString(String s, String goal) {
        HashMap <Character,Integer> map=new HashMap<>();
      if(s.length()==goal.length())
      {
        String str=s+s;
        if(str.contains(goal))
        {
            return true;
        }
        
      }
      return false;

        
        
    }
}
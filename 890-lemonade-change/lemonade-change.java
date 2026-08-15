class Solution {
    public boolean lemonadeChange(int[] bills) {
        
      int five=0;
      int ten=0;
      for(int i:bills)
      {
        if(i==5)
        {
            five+=1;
        }else if(i==10)
        {
             if(five==0)
            {
                return false;
            }
            ten+=1;
            five-=1;
        }else{

            if(ten>=1 && five>=1)
            {
                ten-=1;
                five-=1;
            }else if(five>=3)
            {
                five-=3;
            }else{
                return false;
            }
        }
      }
      return true;
    }
}
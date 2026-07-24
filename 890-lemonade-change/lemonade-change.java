class Solution {
    public boolean lemonadeChange(int[] bills) {
        
       int five=0;
       int ten=0;
       int twen=0;
       for(int i:bills)
       {
   
        
        if(i==5)
        {
          five+=1;
        }
        if(i==10)
        {  
            if(five>0)
            {
            five-=1;
            }else{
                return false;
            }
            ten+=1;
        }
        if(i==20)
        {
           if(ten>0 && five>0)
           {
              ten-=1;
              five-=1;
              twen+=1;
           }else 
           {
            five-=3;
            twen+=1;
           }
           if(five<0 || ten<0) return false;
        }
             
       }
    
       return true;
    }
}
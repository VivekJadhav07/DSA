class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0 && n==0)
        {
            return;
        }
        

int left=m-1;
int right=n-1;
int p=nums1.length-1;


      while(right>=0 && left>=0)
      {
        if(nums2[right]>nums1[left])
        {
             nums1[p]=nums2[right];
             right-=1;
             
        }else{
           nums1[p]=nums1[left];
           left-=1;
        }
        p-=1;
      }
      if(right>=0)
      {
        
            while(right>=0)
            {
           nums1[p]=nums2[right];
           right-=1;
           p-=1;
           
            }

        
      
      }
    }


        
    
}
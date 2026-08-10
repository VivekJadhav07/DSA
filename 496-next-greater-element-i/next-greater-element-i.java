class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
Deque<Integer> stack=new ArrayDeque<Integer>();
        for(int i=nums2.length-1;i>=0;i--)
        {
               while(!stack.isEmpty() && stack.peek()<nums2[i])
               {
                stack.pop();
               }
               if(stack.isEmpty())
               {
               map.put(nums2[i],-1);
                stack.push(nums2[i]);

               }else{
                if(stack.peek()>nums2[i])
                {
                   
                    map.put(nums2[i],stack.peek());
                     stack.push(nums2[i]);
                }
               }
              

            

        
        }

        for(int k=0;k<nums1.length;k++)
        {
            if(map.containsKey(nums1[k]))
            {
            nums1[k]=map.get(nums1[k]);
            }
        }
       return nums1; 
    }
}
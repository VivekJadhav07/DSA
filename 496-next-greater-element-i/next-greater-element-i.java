class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map=new HashMap<>();
        Deque<Integer> stack=new ArrayDeque<>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=nums2.length-1;i>=0;i--)
        {
            while( !stack.isEmpty() && stack.peek()<nums2[i]  )
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                map.put(nums2[i],-1);
            }else if(stack.peek()>nums2[i])
            {
                map.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);
        }
        for(int i:nums1)
        {
          list.add(map.get(i));
        }
       int arr[]=new int[nums1.length];
       for(int i=0;i<arr.length;i++)
       {
         arr[i]=list.get(i);
       }

       return arr;
        
    }
}
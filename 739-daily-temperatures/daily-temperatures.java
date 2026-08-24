class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         HashMap<Integer,Integer> map=new HashMap<>();
        Deque<Integer> stack=new ArrayDeque<>();
     
        for(int i=temperatures.length-1;i>=0;i--)
        {
            while( !stack.isEmpty() && temperatures[stack.peek()]<=temperatures[i]  )
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                map.put(i,0);
            }else if(temperatures[stack.peek()]>temperatures[i])
            {
                map.put(i,stack.peek()-i);
            }
            stack.push(i);
        }
        
       int arr[]=new int[temperatures .length];
       for(int i=0;i<arr.length;i++)
       {
        if(map.containsKey(i))
        {
         arr[i]=map.get(i);
        }
       }

       return arr;
     
    }
}

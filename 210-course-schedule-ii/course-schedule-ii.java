class Solution {
    public int[] findOrder(int numCourses, int[][] edges) {

         ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            list.add(new ArrayList<Integer>());
        }
        for(int i=0;i<edges.length;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            list.get(v).add(u);
        }
        int indegree[] =new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            for(int node:list.get(i))
            {
                indegree[node]++;
            }
        }
        Deque<Integer> deque=new ArrayDeque<>();
        ArrayList<Integer> res=new ArrayList<>();
          for(int i=0;i<numCourses;i++)
        {
           if(indegree[i]==0)
           {
            deque.offer(i);
           }
        }

        while(!deque.isEmpty())
        {
            int node=deque.poll();
            res.add(node);
            for(int i:list.get(node))
            {
                indegree[i]--;
                if(indegree[i]==0)
                {
                    deque.offer(i);
                }
            }
        }
       if(res.size()<numCourses)
       {
        return new int[]{};
       }
       int result[]=new int[res.size()];
      for(int i=0;i<res.size();i++)
      {
         result[i]=res.get(i);
      }
      return result;

        
    }
}
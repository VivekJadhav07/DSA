class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());

      for(int i:nums)
      {
        queue.add(i);
      }
      int m=0;
      for(int i=1;i<=k;i++)
      {
         m=queue.poll();
      }
      return m;
    }
}
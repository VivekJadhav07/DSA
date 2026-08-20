class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        list1.add(nums[0]);
        list2.add(nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            int ar1=list1.get(list1.size()-1);
            int ar2=list2.get(list2.size()-1);

            if(ar1>ar2)
            {
                list1.add(nums[i]);
            }else{
                list2.add(nums[i]);
            }
        }
        int res[]=new int[nums.length];
        int i=0;
      while(i<list1.size())
      {
          res[i]=list1.get(i);
          i++;
      }
        int k=0;
           while(k<list2.size())
      {
          res[i]=list2.get(k);
          i+=1;
          k++;
      }
      return res;
          


        
    }
}
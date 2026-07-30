class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       HashMap<Integer,String> map=new HashMap<>();

        for(int i=0;i<names.length;i++)
        {
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int k=0;
        for(int i=names.length-1;i>=0;i--)
        {
            names[k]=map.get(heights[i]);
            k+=1;
        }
        return names;
        
    }
}
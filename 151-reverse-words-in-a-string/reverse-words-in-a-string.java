class Solution {
    public String reverseWords(String s) {

        String s1[]=s.trim().split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=s1.length-1;i>=1;i--)
        {
            if(s1[i].equals(""))
            {
                continue;
            }else{
            sb.append(s1[i]+" ");
            }
        }
        sb.append(s1[0]);
        return sb.toString();

        


        
    }
}
class Solution {
    public String reverseWords(String s) {

        String s1[]=s.trim().split(" ");
        String str="";
        for(int i=s1.length-1;i>0;i--)
        {
            if(s1[i]=="")
            {
                continue;
            }
            str+=s1[i]+" ";
        }
       str+=s1[0];
       return str;


        
    }
}
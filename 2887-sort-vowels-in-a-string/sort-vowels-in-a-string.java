class Solution {
    public String sortVowels(String s) {
        String str="";
        StringBuilder sb=new StringBuilder();
        int k=0;
        for(char ch:s.toCharArray())
        {
            if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
            {
                    str+=ch;
            }

        }
        char[] str1=str.toCharArray();

        Arrays.sort(str1);
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
           if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
            {
              sb.append(str1[k]);
              k+=1;
                     
            }else{
                    sb.append(ch);
            }
        }
        return sb.toString();
        
    }
}
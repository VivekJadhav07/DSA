class Solution {
    public int findContentChildren(int[] g, int[] s) {

        int i=0;
        int j=0;
        int n1=g.length-1;
        int n2=s.length-1;
        int op=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<=n1 && j<=n2)
        {
   
           if(s[j]>=g[i])
           {
             op+=1;
             i+=1;
             j+=1;
           }else {
            j+=1;
           }
           
        }
        return op;
                
    }
}
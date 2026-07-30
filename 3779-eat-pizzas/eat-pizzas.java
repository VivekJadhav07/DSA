class Solution {
    public long maxWeight(int[] pizzas) {
        Arrays.sort(pizzas);
        int totaldays=pizzas.length/4;
        int k=pizzas.length-1;
        boolean even=true;
        long weight=0;
        for(int i=1;i<=totaldays;i+=2)
        {     
              weight+=pizzas[k--];
             
        }
        k-=1;
        for(int i=2;i<=totaldays;i+=2)
        {
            weight+=pizzas[k];
            k-=2;
        }
        return weight;
        
        
    }
}
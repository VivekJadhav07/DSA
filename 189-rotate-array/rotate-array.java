class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length-1;
        int m=k%nums.length;

        //last to n-k
        int left=n-m+1;
        int right=n;
        reverse(left,right,nums);
       
        //first to n-k
        left=0;
        right=n-m;
        reverse(left,right,nums);

        //reverse all
        left=0;
        right=nums.length-1;
        reverse(left,right,nums);



    
        
    }
    public void reverse(int i,int j,int[] arr) {
        int left=i;
        int right=j;
        // code here
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left+=1;
            right-=1;
        }
    }
}
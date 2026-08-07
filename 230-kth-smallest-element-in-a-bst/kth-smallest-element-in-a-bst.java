/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int k;
    public int result;
    public int kthSmallest(TreeNode root, int k) {
        this.k=k;
        this.result=-1;
      
           fun(root);
           return result;
        
    }
    public void fun(TreeNode root) 
    {
         if(root==null)
         {
            return;
         }
           
         if(root.left!=null) fun(root.left);
         
         if(--k==0)
         { 
           result=root.val;
            return;
         }
       
        if(root.right!=null) fun(root.right);




    }
}
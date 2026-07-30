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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
         if(root==null)
        {
            return 0;
        }
        fun(root);
        return max;
    }
    public int fun(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
      int left=fun(root.left);
      int right=fun(root.right);
      left = Math.max(0, left);
      right = Math.max(0, right);
      
  
      max=Math.max(max,root.val+left+right);
     
        
       
     
     
        return root.val+Math.max(left,right);
    }
}
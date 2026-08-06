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
     
    public List<String> binaryTreePaths(TreeNode root) {
    List<String> res=new ArrayList<>();
      
          if(root==null)
          {
            return res;
          }
        
          fun(root,res,"");
          return res;
        
        
    }
    public void fun(TreeNode root,List<String> res,String str)
    {
        if(str.isEmpty())
        {
            str=String.valueOf(root.val);
        }else {
            str = str + "->" + root.val;
        }
      
        if(root.left!=null) 
        {
      
        fun(root.left,res,str);
        }
          if(root.left==null && root.right==null)
        {
        
          res.add(str);
          return;
        }
        if(root.right!=null) 
        {
          
            fun(root.right,res,str);
        }
    }
}
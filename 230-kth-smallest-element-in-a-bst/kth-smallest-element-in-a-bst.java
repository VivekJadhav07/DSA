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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list=new ArrayList<Integer>();

           fun(root,list);
           return list.get(k-1);
        
    }
    public void fun(TreeNode root,ArrayList<Integer> list)
    {
         if(root==null)
         {
            return;
         }
         if(root.left!=null) fun(root.left,list);
         list.add(root.val);
        if(root.right!=null) fun(root.right,list);




    }
}
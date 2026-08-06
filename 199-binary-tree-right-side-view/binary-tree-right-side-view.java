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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        fun(root,list,0);
        return list;
        
    }
    public void fun(TreeNode root,List<Integer> list,int curr){
        if(root==null)
        {
            return;
        }
        if(list.size()==curr)
        {
            list.add(root.val);

        }
        if(root.right!=null) fun(root.right,list,curr+1);
        if(root.left!=null) fun(root.left,list,curr+1);
    }
}
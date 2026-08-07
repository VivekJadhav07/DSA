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
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder,Integer.MAX_VALUE,new int[]{0});
    }
    public TreeNode bstFromPreorder(int[] preorder,int max,int[] i)
    {
        if(preorder.length==i[0] || preorder[i[0]]>max) return null;
        TreeNode node=new TreeNode(preorder[i[0]++]);
        node.left=bstFromPreorder(preorder,node.val,i);
        node.right=bstFromPreorder(preorder,max,i);
        return node;

    }
}
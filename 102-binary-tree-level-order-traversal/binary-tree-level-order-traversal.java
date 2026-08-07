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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
         if(root==null)
         {
            return res;
         }
        Deque<TreeNode> deque=new ArrayDeque<>();
        deque.offer(root);
        while(!deque.isEmpty())
        {
           ArrayList<Integer> list=new ArrayList<>();
           int k=deque.size();
           for(int i=0;i<k;i++)
           {
              TreeNode ele=deque.poll();
              list.add(ele.val);
              if(ele.left!=null)
              {
                deque.add(ele.left);
              }
                if(ele.right!=null)
              {
                deque.add(ele.right);
              }
           }

           res.add(list);




        }
        return res;
    }
}
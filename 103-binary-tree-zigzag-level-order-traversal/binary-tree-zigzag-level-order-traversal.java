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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> deque=new ArrayDeque<>();
        List<List<Integer>> result=new ArrayList<>();
     if(root==null)
     {
        return result;
     }
        deque.offer(root);
        boolean flag=false;
        while( !deque.isEmpty() )
        {
            ArrayList<Integer> list1=new ArrayList<>();
            int size=deque.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node=deque.poll();
                 list1.add(node.val);

                if(node.left!=null) deque.offer(node.left);
                if(node.right!=null) deque.offer(node.right);
                
               
            }
        
              if(flag)
              {
            Collections.reverse(list1);
              }
                    flag=!flag;
            result.add(list1);
        }
       return result;
    }
}
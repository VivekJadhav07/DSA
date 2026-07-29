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
       
       List<List<Integer>> list=new ArrayList<>();
       Deque<TreeNode> queue=new ArrayDeque<>();
 if(root==null)
        {
            return list;
        }
       queue.offer(root);
    //     ArrayList<Integer> list3=new ArrayList<>();
    //     list3.add(root.val);
    //    list.add(list3);
       while(!queue.isEmpty())
       {
         ArrayList<Integer> list1=new ArrayList<>();
           int k=queue.size();
          for(int i=0;i<k;i++)
          {
          TreeNode temp=queue.poll();
           list1.add(temp.val);
          if(temp.left!=null)
          {
          queue.offer(temp.left);
          }
          if(temp.right!=null)
          {
            queue.offer(temp.right);
          }
          }
         
        
          list.add(list1);

          
       }
        return list;
    }
}
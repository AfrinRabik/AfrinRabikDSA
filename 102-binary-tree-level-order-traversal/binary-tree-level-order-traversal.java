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
class Solution 
{
    public void levelorder(TreeNode root,ArrayList<List<Integer>> result)
    {
        if(root==null)return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            ArrayList<Integer> ans=new ArrayList<>();
            int s=q.size();
            for(int i=0;i<s;i++)
            {
                TreeNode curr=q.poll();
                ans.add(curr.val);
               
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
            result.add(ans); 
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        ArrayList<List<Integer>> result=new ArrayList<>();
        

        levelorder(root,result);
        return result;
    }
}
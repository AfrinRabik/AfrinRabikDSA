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
    public int sumNumbers(TreeNode root) 
    {
        if(root==null)return 0;
        Stack<TreeNode> node=new Stack<>();
        Stack<Integer> numbers=new Stack<>();
        node.push(root);
        numbers.push(root.val);
        int sum=0;
        while(!node.isEmpty())
        {
            TreeNode currnode=node.pop();
            int currnum=numbers.pop();
            

            if(currnode.left==null&&currnode.right==null)
            {
                sum+=currnum;
                
            }


            if(currnode.left!=null)
            {
                node.push(currnode.left);
                numbers.push(currnum*10+currnode.left.val);
            }
            if(currnode.right!=null)
            {
                node.push(currnode.right);
                numbers.push(currnum*10+currnode.right.val);
            }
        }
        return sum;
    }
}
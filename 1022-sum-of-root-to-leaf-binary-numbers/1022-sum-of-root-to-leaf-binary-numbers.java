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
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root,0);
        
    }
    private int dfs(TreeNode node,int currentval)
    {
        if(node==null)
        return 0;
        currentval=currentval*2+node.val;
        if(node.left==null && node.right==null)
        return currentval;
        return dfs(node.left,currentval)+dfs(node.right,currentval);

        
    }
}
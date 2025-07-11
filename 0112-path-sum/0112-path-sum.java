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
    private boolean sum(TreeNode node, int target,int sum){
        if(node==null){
            return false;
        }
        sum+=node.val;
        if((node.left==null&&node.right==null)&&sum==target){
            return true;
        }
        return sum(node.left,target,sum)||sum(node.right,target,sum);

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
       return sum(root,targetSum,0);

        
    }
}
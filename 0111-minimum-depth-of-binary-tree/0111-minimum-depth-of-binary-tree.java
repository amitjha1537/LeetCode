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
    public int minDepth(TreeNode root) {
        return min(root);
        
    }
    private int min(TreeNode node){
        if(node==null){
            return 0;
        }
        if(node.left==null){
            return 1+min(node.right);
        }
        if(node.right==null){
            return 1+min(node.left);
        }
        return 1+ Math.min(min(node.left),min(node.right));
    }
    

}
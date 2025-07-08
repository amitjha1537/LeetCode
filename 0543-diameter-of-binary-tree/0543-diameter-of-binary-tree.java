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
    int maxDiameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        max(root);
        return maxDiameter;

        
    }
    private int max(TreeNode node){
        if(node==null){
            return 0;
        }
        int h1=max(node.left);
        int h2=max(node.right);
        maxDiameter=Math.max(maxDiameter,h1+h2);
        return 1+Math.max(h1,h2);
    }
    

}

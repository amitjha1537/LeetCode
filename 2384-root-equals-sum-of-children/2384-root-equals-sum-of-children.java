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
    private boolean sum(TreeNode node){
        if(node==null){
            return true;
        }
        if(node.left==null&&node.right==null){
            return true;
        }
        if(node.left==null|| node.right==null){
            return false;
        }
        if(node.val!=(node.left.val+node.right.val)){
            return false;
        }
        else{
            return true;
        }

    }
    public boolean checkTree(TreeNode root) {
       return  sum(root);

        
    }
}
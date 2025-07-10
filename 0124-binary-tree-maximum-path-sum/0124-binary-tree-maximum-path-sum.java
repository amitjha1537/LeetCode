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
    private int max(TreeNode node,int[] arr){
      
        if(node==null){
            return 0;
        }
        int left=Math.max(0,max(node.left,arr));
        int right=Math.max(0,max(node.right,arr));
        arr[0]=Math.max(arr[0],left+node.val+right);
        return node.val+Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
         int[] arr=new int[]{Integer.MIN_VALUE};
         max(root,arr);
         return arr[0];
        
    }
}
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
    Queue<TreeNode> ans=new LinkedList<>();
    List<List<Integer>> result=new ArrayList<>();
    if(root==null) return result;
    ans.add(root);
    while(!ans.isEmpty()){
        int size=ans.size();
        List<Integer> level=new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode value=ans.poll();
            level.add(value.val);
            if(value.left!=null){
            ans.add(value.left);
        }
        if(value.right!=null){
            ans.add(value.right);
        }
        }
        result.add(level);

    }
       return result; 
        
    }
}
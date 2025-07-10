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
   
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
                    }
        Queue<TreeNode> ans=new LinkedList<>();
        ans.offer(root);

        int count=1;
        while(!ans.isEmpty()){
            int size=ans.size();
        List<Integer> temp=new ArrayList<>(size);

        for(int i=0;i<size;i++){
            TreeNode curr=ans.poll();
            temp.add(curr.val);
            if(curr.left!=null){
                ans.offer(curr.left);
            }
            if(curr.right!=null){
                ans.offer(curr.right);
            }

            
        }
        if(count%2==0){
            Collections.reverse(temp);
        }
        count++;

         result.add(temp);
        }
    
    return result;
   
}
}
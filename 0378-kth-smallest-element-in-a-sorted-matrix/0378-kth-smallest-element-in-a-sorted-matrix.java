class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> ans=new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                ans.add(matrix[i][j]);
                if(ans.size()>k){
                    ans.poll();
                }
            }
        }
        return ans.peek();
    }
}
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Traingle=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            int ans=1;
            ArrayList<Integer> row=new ArrayList<>();
            row.add(ans);
            for(int j=1;j<i;j++){
                ans=ans*(i-j);
                ans=ans/j;
                row.add(ans);
            }
            Traingle.add(row);
        }
        return Traingle;
    }
}
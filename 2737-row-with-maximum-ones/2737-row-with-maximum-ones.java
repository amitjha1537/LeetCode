class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] arr=new int[2];
        int count=0;
        int ans=0;
       
        for(int i=0;i<mat.length;i++){
             int temp=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    temp++;

                }
                
                
                
                
            }
            if(temp>count){
                    count=temp;
                    arr[0]=i;
                    arr[1]=count;
                }
        }
        return arr;
        
    }
}
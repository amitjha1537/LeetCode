class Solution {
     public static void swap(int matrix[][],int i1,int j1,int i2, int j2 ){
        int temp=matrix[i1][j1];
        matrix[i1][j1]=matrix[i2][j2];
        matrix[i2][j2]=temp;
        

       }
       public static void reverse(int [] row){
        int left=0;
        int right=row.length-1;
              while(left<right){
                int temp=row[left];
             row[left]=row[right];
                row[right]=temp;
                left++;
                right--;
              }
       }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
      
       
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(matrix,i,j,j,i);

            }
        }
        for(int i=0;i<n;i++){
            
                reverse(matrix[i]);
            }
        
        
    }
}
class Pair{
    int row,col,time;
    Pair(int r, int c, int t){
     this.row=r;
      this.col=c;
      this.time=t; 
    }
    

}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        int countfresh=0;
        int[][] vis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                else{
                    vis[i][j]=0;

                }
                if(grid[i][j]==1) countfresh++;
            }
        }
        int cnt=0;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        
        int time =0;
        while(!q.isEmpty()){
            Pair p=q.poll();
            int r=p.row;
            int c=p.col;
            int t=p.time;
            time=Math.max(t,time);
            for(int i=0;i<4;i++){
                int rc=r+drow[i];
                int dc=c+dcol[i];
                if(rc>=0&&rc<n&&dc>=0&&dc<m&&vis[rc][dc]==0&&grid[rc][dc]==1){
                    q.offer(new Pair(rc,dc,t+1));
                    vis[rc][dc]=2;
                     cnt++;
                }
               
            }

        }
        if(cnt!=countfresh) return -1;
        return time;
        
    }
}
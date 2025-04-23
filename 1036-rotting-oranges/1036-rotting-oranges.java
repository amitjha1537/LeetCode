class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh=0;
        
        Queue<int[]> bfs=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    bfs.add(new int[]{i,j});
                    
                }
                else if(grid[i][j]==1){
                   fresh++;

                }

            }
        }
       int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        int time = 0;

        while (!bfs.isEmpty() && fresh > 0) {
            int size = bfs.size();
            for (int i = 0; i < size; i++) {
                int[] cell = bfs.poll();
                for (int[] dir : directions) {
                    int x = cell[0] + dir[0];
                    int y = cell[1] + dir[1];

                    if (x >= 0 && y >= 0 && x < n && y < m && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        bfs.add(new int[]{x, y});
                        fresh--;
                    }
                }
            }
            time++;
        }

        return fresh == 0 ? time : -1;
        
    }
}
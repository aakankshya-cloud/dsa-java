public class NumberOfEnclaves {
    public int numEnclaves(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];
        for(int j = 0; j < n; j++){
            if(grid[0][j] == 1 && vis[0][j] == 0){
                dfs(0,j,vis,grid);
            }
            if(grid[m-1][j] == 1 && vis[m-1][j] == 0){
                dfs(m-1,j,vis,grid);
            }
        }
        for(int i = 0; i < m; i++){
            if(vis[i][0] == 0 && grid[i][0] == 1){
                dfs(i,0,vis,grid);
            }
            if(vis[i][n-1] == 0 && grid[i][n-1] == 1){
                dfs(i,n-1,vis,grid);
            }
        }
        int cnt = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && vis[i][j] == 0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void dfs(int row, int col, int[][] vis, int[][] grid){
        vis[row][col] = 1;
        int m = grid.length;
        int n = grid[0].length;
        int[] drow = {0,-1,0,1};
        int[] dcol = {-1,0,1,0};
        for(int i = 0; i < 4; i++){
            int r = row + drow[i];
            int c = col + dcol[i];
            if(r >= 0 && r < m && c >= 0 && c < n && vis[r][c] == 0 && grid[r][c] == 1){
                dfs(r,c,vis,grid);
            }
        }
    }
}

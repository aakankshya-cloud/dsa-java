//public class NumberOfIslands {
//    public int numIslands(char[][] grid){
//        int m = grid.length;
//        int n = grid[0].length;
//        int cnt = 0;
//        boolean[][] vis = new boolean[m][n];
//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < n; j++){
//                if(grid[i][j] == '1' && !vis[i][j]){
//                    cnt++;
//                    dfs(grid,vis,i,j,m,n);
//                }
//            }
//        }
//        return cnt;
//    }
//    public void dfs(char[][] grid,boolean[][] vis, int row, int col, int m, int n){
//        vis[row][col] = true;
//        int[] drow = {0,-1,0,1};
//        int[] dcol = {-1,0,1,0};
//        for(int i = 0; i < 4; i++){
//            int r = row + drow[i];
//            int c = col + dcol[i];
//            if(r >= 0 && r < m && c >= 0 && c < n && grid[r][c] == '1' && !vis[r][c]){
//                dfs(grid,vis,r,c,m,n);
//            }
//        }
//
//    }
//
//}

import java.util.ArrayList;
import java.util.HashSet;

public class NumberOfDistinctIslands {
    public int numIslands(char[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];
        HashSet<ArrayList<String>> set = new HashSet<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1' && vis[i][j] == 0){
                    ArrayList<String> arr = new ArrayList<>();
                    dfs(i,j,vis,grid,arr,i,j);
                    set.add(arr);
                }
            }
        }
        return set.size();
    }
    private void dfs(int row, int col, int[][] vis, char[][] grid, ArrayList<String> arr, int row0, int col0){
        vis[row][col] = 1;
        arr.add(((row - row0)+","+(col - col0)));
        int m = grid.length;
        int n = grid[0].length;
        int[] drow = {0,-1,0,1};
        int[] dcol = {-1,0,1,0};
        for(int i = 0; i < 4; i++){
            int r = row + drow[i];
            int c = col + dcol[i];
            if(r >= 0 && r < m && c >= 0 && c < n && vis[r][c] == 0 && grid[r][c] == 1){
                dfs(r,c,vis,grid,arr,row0,col0);
            }
    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public int numIslands(char[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 1;
        boolean[][] vis = new boolean[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!vis[i][j] && grid[i][j] == '1'){
                    cnt++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return cnt;
    }
    private void bfs(int row, int col, boolean[][] vis, char[][] grid){
        Queue<Pair> queue = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        vis[row][col] = true;
        queue.add(new Pair(row,col));
        while(!queue.isEmpty()){
            int r = queue.peek().first;
            int c = queue.peek().second;
            queue.poll();
            for(int delRow = -1 ; delRow <= 1; delRow++){
                for(int delCol = -1 ; delCol <= 1; delCol++){
                    int nrow = r + delRow;
                    int ncol = c + delCol;
                    if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == '1' && vis[nrow][ncol] == false){
                        vis[nrow][ncol] = true;
                        queue.add(new Pair(nrow,ncol));
                    }
                }
            }

        }



    }
}

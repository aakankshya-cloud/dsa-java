import javax.management.Query;
import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    class Pair{
        int row;
        int col;
        int tm;
        Pair(int row,int col,int tm){
            this.row = row;
            this.col = col;
            this.tm = tm;
        }
    }
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        Queue<Pair> queue = new LinkedList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2){
                    vis[i][j] = true;
                    queue.add(new Pair(i,j,0));
                }
            }
        }
        int tm = 0;
        while(!queue.isEmpty()){
            int r = queue.peek().row;
            int c = queue.peek().col;
            int t = queue.peek().tm;
            queue.remove();
            tm = Math.max(tm,t);
            int[] drow = {0,-1,0,1};
            int[] dcol = {-1,0,1,0};
            for(int i = 0; i < 4; i++){
                int row = r + drow[i];
                int col = c + dcol[i];
                if(row >= 0 && row < m && col >= 0 && col < n && !vis[row][col] && grid[row][col] == 1){
                    vis[row][col] = true;
                    grid[row][col] = 2;
                    queue.add(new Pair(row,col,t + 1));
                }
            }
        }
        return tm;
    }
}

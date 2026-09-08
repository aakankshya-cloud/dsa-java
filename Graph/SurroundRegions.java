import java.util.LinkedList;
import java.util.Queue;

public class SurroundRegions {
    public void solve(char[][] board){
        int m = board.length;
        int n = board[0].length;
        int[][] vis = new int[m][n];
        Queue<Integer> queue = new LinkedList<>();
        for(int j = 0; j < n; j++){
            if(vis[0][j] == 0 && board[0][j] == 'O'){
                dfs(0,j,vis,board);
            }
            if(vis[m-1][j] == 0 && board[n-1][j] == 'O'){
                dfs(m-1,j,vis,board);
            }
        }
        for(int i = 0; i < m; i++){
            if(vis[i][0] == 0 && board[i][0] == 'O'){
                dfs(i,0,vis,board);
            }
            if(vis[i][n-1] == 0 && board[i][m-1] == 'O'){
                dfs(i,n-1,vis,board);
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(vis[i][j] == 0 && board[i][j] == 'O'){
                    board[i][j] = 'X';
                    vis[i][j] = 1;
                }
            }
        }
    }
    public void dfs(int row, int col, int[][] vis,char[][] board){
        int m = board.length;
        int n = board[0].length;
        vis[row][col] = 1;
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,-1,0,1};
        for(int i = 0; i < 4; i++){
            int r = row + drow[i];
            int c = col + dcol[i];
            if(r >= 0 && r < m && c >= 0 && c < n && vis[r][c] == 0 && board[r][c] == 'O'){
                dfs(r,c,vis,board);
            }
        }

    }
}

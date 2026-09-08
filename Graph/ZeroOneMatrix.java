import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrix {
    class Pair{
        int first;
        int second;
        int dist;
        Pair(int first, int second, int dist){
            this.first = first;
            this.second = second;
            this.dist = dist;
        }

    }
    public int[][] updateMatrix(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        int[][] vis = new int[m][n];
        int[][] distance = new int[m][n];
        Queue<Pair> queue = new LinkedList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 0){
                    queue.add(new Pair(i,j,0));
                    distance[i][j] = 0;
                    vis[i][j] = 1;
                }
                else{
                    vis[i][j] = 0;
                }

            }
        }
        while (!queue.isEmpty()){
            int row = queue.peek().first;
            int col = queue.peek().second;
            int dis = queue.peek().dist;
            queue.remove();
            int[] drow = {0,-1,0,1};
            int[] dcol = {-1,0,1,0};
            for(int i = 0; i < 4; i++){
                int r = row + drow[i];
                int c = col + dcol[i];
                if(r >= 0 && r < m && c >= 0 && c < n && vis[r][c] == 0){
                    vis[r][c] = 1;
                    distance[r][c] = dis + 1;
                    queue.add(new Pair(r,c,dis + 1));
                }
            }
        }
        return distance;
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color){
        int m = image.length;
        int n = image[0].length;
        boolean[][] vis = new boolean[m][n];
        int org = image[sr][sc];
        image[sr][sc] = color;
        vis[sr][sc] = true;
        bfs(image,vis,sr,sc,org,color);
        return image;
    }
    public void bfs(int[][] image, boolean[][] vis, int sr, int sc, int org, int color){
        int m = image.length;
        int n = image[0].length;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(sr,sc));
        while(!queue.isEmpty()){
            int row = queue.peek().first;
            int col = queue.peek().second;
            queue.remove();
            int[] drow = {0,-1,0,1};
            int[] dcol = {-1,0,1,0};
            for(int i = 0; i < 4; i++){
                        int r = row + drow[i];
                        int c = col + dcol[i];
                        if(r >= 0 && r < m && c >= 0 && c < n && image[r][c] == org && !vis[r][c]){
                            vis[r][c] = true;
                            image[r][c] = color;
                            queue.add(new Pair(r,c));
                    }
                }
            }
        }

    }


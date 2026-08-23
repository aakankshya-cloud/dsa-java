import java.util.LinkedList;
import java.util.Queue;

class Solution {
    class Pair{
        int row;
        int col;
        int distance;
        Pair(int row, int col,int distance){
            this.row = row;
            this.col = col;
            this.distance = distance;
        }
    }
    public int[][] nearest(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] gridCopy = new int[m][n];
        int[][] vis = new int[m][n];
        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {
                    queue.add(new Pair(i, j, 0));
                    vis[i][j] = 1;
                }
            }
        }
        int[] drow = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dcol = {-1, 0, 1, -1, 1, -1, 0, 1};
                    while(!queue.isEmpty()){
                        Pair p = queue.poll();
                        int row = p.row;
                        int col = p.col;
                        int dist = p.distance;
                        gridCopy[row][col] = dist;
                        for(int k = 0; k < 8; k++){
                            int r = row + drow[k];
                            int c = col + dcol[k];
                            if(r >= 0 && r < m && c >= 0 && c < n && vis[r][c] == 0){
                                vis[r][c] = 1;
                                queue.add(new Pair(r,c,dist + 1));
                            }

                        }

                    }
        return gridCopy;
                }

            }
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class RottingOranges {
//    class Pair{
//        int row;
//        int col;
//        int time;
//        Pair(int row, int col, int time){
//            this.row = row;
//            this.col = col;
//            this.time = time;
//        }
//    }
//    public int orangesRotting(int[][] grid){
//        int m = grid.length;
//        int n = grid[0].length;
//        boolean[][] vis = new boolean[m][n];
//        Queue<Pair> queue = new LinkedList<>();
//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < n; j++){
//                if(grid[i][j] == 2 && !vis[i][j]){
//                    vis[i][j] = true;
//                    queue.add(new Pair(i,j,0));
//                }
//            }
//        }
//        int time = 0;
//        while(!queue.isEmpty()){
//            Pair node = queue.poll();
//            int row = node.row;
//            int col = node.col;
//            time = Math.max(time, node.time);
//            int[] drow = {0,-1,0,1};
//            int[] dcol = {-1,0,1,0};
//            for(int i = 0; i < 4; i++){
//                int r = row + drow[i];
//                int c = col + dcol[i];
//                if(r >= 0 && r < m && c >= 0 && c < n && !vis[r][c] && grid[r][c] == 1){
//                    vis[r][c] = true;
//                    grid[r][c] = 2;
//                    queue.add(new Pair(r,c,node.time + 1));
//                }
//            }
//        }
//        // Check if any fresh orange remains
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (grid[i][j] == 1) {
//                    return -1;
//                }
//            }
//        }
//        return time;
//    }
//}

import java.util.ArrayList;

public class NumberOfIslands {
    public int numIslands(char[][] grid){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] && i != j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

    }
    private void dfs(char[][] grid, int row, int col){


    }
}

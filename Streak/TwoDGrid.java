import java.util.*;
public class TwoDGrid {


        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            int m = grid.length;
            int n = grid[0].length;
            int total = m * n;

            k = k % total;

            int[][] ans = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    // Current 1D index
                    int currentIndex = i * n + j;

                    // New 1D index after shifting
                    int newIndex = (currentIndex + k) % total;

                    // Convert back to 2D
                    int newRow = newIndex / n;
                    int newCol = newIndex % n;

                    ans[newRow][newCol] = grid[i][j];
                }
            }

            List<List<Integer>> result = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                List<Integer> row = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    row.add(ans[i][j]);
                }
                result.add(row);
            }

            return result;
        }
    }


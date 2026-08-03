import java.util.*;

public class Neetcode150 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        for(int i = 0; i < m; i++){
            if(matrix[i][0] <= target && matrix[i][n - 1] >= target){
                int left = 0;
                int right = n - 1;
                while(left <= right){
                    int mid = (left + right) / 2;
                    if(target == matrix[i][mid]){
                        return true;
                    }
                    else if(target > matrix[i][mid]){
                        left = mid + 1;
                    }
                    else{
                        right = mid - 1;
                    }
                }
                return false;
            }
        }
        return false;

    }
}

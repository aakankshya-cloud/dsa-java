import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        for(int i = 0; i < m; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j < n; j++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])){
                    return false;
                }
                set.add(board[i][j]);
            }
        }
        for(int i = 0; i < n; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j < m; j++){
                if(board[j][i] == '.') continue;
                if(set.contains(board[j][i])){
                    return false;
                }
                set.add(board[j][i]);
            }
        }
        for(int a = 0; a < 9; a += 3){
            for(int b = 0; b < 9; b += 3){
                HashSet<Character> set = new HashSet<>();
                for(int i = a; i < a + 3; i++){
                    for(int j = b; j < b + 3; j++){
                        if(board[i][j] == '.') continue;
                        if(set.contains(board[i][j])){
                            return false;
                        }
                        set.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }
}

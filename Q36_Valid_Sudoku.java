import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Q36_Valid_Sudoku {
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> rows = new HashSet<>();
            HashSet<Character> columns = new HashSet<>();
            HashSet<Character> box = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if ((board[i][j] != '.' && !rows.add(board[i][j]))) {
                    return false;
                }
                if (board[j][i] != '.' && !columns.add(board[j][i])) {
                    return false;
                }
                int rowIndex = 3*(i/3);
                int colIndex = 3*(i%3);
                if(board[rowIndex+j/3][colIndex+j%3] != '.' && !box.add(board[rowIndex+j/3][colIndex+j%3])) {
                    return false;
                }


            }

        }
        return true;
    }
}

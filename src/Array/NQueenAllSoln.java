package Array;
import java.util.*;

public class NQueenAllSoln {
static List<List<String>> ans = new ArrayList<List<String>>();

    public static void main(String[] args) {

    ans = solveNQueens(4);
        System.out.println(ans );
    }

    public static List<List<String>> solveNQueens(int n) {
        int matrix[][] = new int[n][n];
        solve(matrix, n, 0);
        return ans;
    }

    private static boolean solve(int[][] matrix, int n, int col) {
        if(col==n){
            ArrayList<String> row = new ArrayList<>();
            for(int i=0; i<n; i++){
                String r = "";
                for(int j=0; j<n; j++){
                    if(matrix[i][j] == 0)
                        r = r + ".";
                    else
                        r = r + "Q";
                }
                row.add(r);
            }
            ans.add(row);
            return true;
        }
        boolean res = false;
        for(int i=0; i<n; i++){
            if(isSafe(n, i, col, matrix)){
                matrix[i][col] = 1;
                res = solve(matrix, n, col+1) || res;
                matrix[i][col] = 0;
            }
        }
        return res;
    }

    private static boolean isSafe(int n, int row, int col, int[][] matrix) {
        for(int i=0; i<col; i++) {
            if (matrix[row][i] == 1)
                return false;
        }

        // lower left diag
        for(int i=row, j=col; i<n && j>=0; i++, j--){
            if (matrix[i][j] == 1)
                return false;
        }

        // upper left diag
        for(int i=row, j=col; i>=0 && j>=0; i--, j--){
            if (matrix[i][j] == 1)
                return false;
        }
        return true;
    }

} // class ends

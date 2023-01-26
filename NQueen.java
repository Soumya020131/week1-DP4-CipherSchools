public class NQueen {
    public static boolean isSafetoPlace(int[][] board, int row, int col){
        int i, j;
        int n = board.length;
        for(i = 0; i < col; i++){
            if(board[row][i] == 1){
                return false;
            }
        }
        for(i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        for(i = row, j = col; i < n && j >= 0; i++, j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        return true;
    }
    public static boolean solveNQueen(int[][] board, int col){
        int n = board.length;
        if(col == n){
            printBroard(board);
            System.out.println("=====================================");
            return false;
        }
    
        /*if(col >= n){
            
            return true;
        }*/
        for(int i = 0; i < n; i++){
            if(isSafetoPlace(board, i, col)){
                board[i][col] = 1;
                if(solveNQueen(board, col + 1)){
                    
                    return true;
                }
                board[i][col] = 0;
            }
        }
        
        return false;
    }
    public static void printBroard(int[][] board){
        int n = board.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        solveNQueen(board, 0);
        /*if(solveNQueen(board, 0)){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("No solution");
        }*/
    }
    
}

package BackTracking;

public class Nqueens {
    
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println("No of Possibilities : "+ nQueens(board, 0));
    }

    // recursive aporoach..
    static int nQueens(boolean[][] board,int row){

        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count =0;
        for(int col = 0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count+=nQueens(board, row+1);
                // if(count==1) return 1;    // If we need only one possibilty...
                board[row][col] = false;
            }
        }
        return count;
    }
    // Checking whether safe or not..
    static boolean isSafe(boolean[][] board, int row, int col) {
        // for top to row checking
        for(int i=0;i<row;i++){
            if(board[i][col]) return false;
        }
        // this is for left side check
        int left = Math.min(row,col);
        for(int i=1;i<=left;i++){
            if(board[row-i][col-i]) return false;
        }
        // this is for right side check
        int right = Math.min(row,board.length- col-1);
        for(int i=1;i<=right;i++){
            if(board[row-i][col+i]) return false;
        }

        return true;
    }
    // Display the board...
    private static void display(boolean[][] board) { 
        
        for(boolean[] q : board){
            for(boolean t : q){
                if(t){
                    System.out.print("Q ");
                }
                else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}

public class TicTacToeUC1 {

    // Method to initialize board
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Method to print board
    public static void printBoard(char[][] board) {
        System.out.println("Tic-Tac-Toe Board:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // move to next row
        }
    }

    public static void main(String[] args) {

        // Create 3x3 board
        char[][] board = new char[3][3];

        // Initialize board
        initializeBoard(board);

        // Display board
        printBoard(board);
    }
}
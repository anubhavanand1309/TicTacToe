import java.util.Scanner;

public class TicTacToeUC5 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        System.out.println("=== TIC TAC TOE ===");

        System.out.print("Enter row (0-2): ");
        int row = scanner.nextInt();

        System.out.print("Enter column (0-2): ");
        int col = scanner.nextInt();

        if (isValidMove(board, row, col)) {
            System.out.println("Valid Move");
        } else {
            System.out.println("Invalid Move");
        }
    }

    // Method to validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Check row and column bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != ' ') {
            return false;
        }

        return true;
    }
}
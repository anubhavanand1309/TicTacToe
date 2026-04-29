import java.util.Random;
import java.util.Scanner;

public class TicTacToeUC2 {

    static char player1Symbol;
    static char player2Symbol;
    static int currentPlayer;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== TIC TAC TOE GAME ===");
        System.out.print("Enter Player 1 Name: ");
        String player1 = scanner.nextLine();

        System.out.print("Enter Player 2 Name: ");
        String player2 = scanner.nextLine();

        // Toss to decide first player
        int toss = random.nextInt(2); // 0 or 1

        if (toss == 0) {
            currentPlayer = 1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = 2;
            player1Symbol = 'O';
            player2Symbol = 'X';
        }

        // Display toss result
        System.out.println("\n=== Toss Result ===");

        if (currentPlayer == 1) {
            System.out.println(player1 + " won the toss.");
            System.out.println(player1 + " plays first with symbol " + player1Symbol);
            System.out.println(player2 + " gets symbol " + player2Symbol);
        } else {
            System.out.println(player2 + " won the toss.");
            System.out.println(player2 + " plays first with symbol " + player2Symbol);
            System.out.println(player1 + " gets symbol " + player1Symbol);
        }

        scanner.close();
    }
}
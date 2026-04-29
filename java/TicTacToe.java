import java.util.Scanner;

public class TicTacToeUC3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=== TIC TAC TOE ===");

        int slot = getUserSlotInput();

        System.out.println("Player selected slot: " + slot);
    }

    // Method to accept user slot input
    public static int getUserSlotInput() {

        System.out.print("Enter slot number (1-9): ");
        int slot = scanner.nextInt();

        return slot;
    }
}
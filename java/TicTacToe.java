import java.util.Scanner;

public class TicTacToeUC4 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=== TIC TAC TOE ===");

        int slot = getSlotInput();

        int row = getRow(slot);
        int col = getColumn(slot);

        System.out.println("Slot Number : " + slot);
        System.out.println("Row Index   : " + row);
        System.out.println("Column Index: " + col);
    }

    // Read slot number from user
    public static int getSlotInput() {
        System.out.print("Enter slot number (1-9): ");
        return scanner.nextInt();
    }

    // Convert slot to row index
    public static int getRow(int slot) {
        return (slot - 1) / 3;
    }

    // Convert slot to column index
    public static int getColumn(int slot) {
        return (slot - 1) % 3;
    }
}
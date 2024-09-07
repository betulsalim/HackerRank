import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Print the header line
        System.out.println("================================");

        // Read each line of input until no more lines are available
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String stringPart = parts[0];
            int integerPart = Integer.parseInt(parts[1]);

            // Print formatted output
            System.out.printf("%-15s%03d%n", stringPart, integerPart);
        }

        // Print the footer line
        System.out.println("================================");
    }
}

import java.util.Scanner;

public class SumPositiveNumbers32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (or 'O' to stop):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("O")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                if (number > 0) {
                    sum += number;
                }
            } catch (NumberFormatException e) {
                
                System.out.println("Invalid input, please enter a valid number or 'O' to stop.");
            }
        }
        System.out.println("Sum of positive numbers: " + sum);
    }
}

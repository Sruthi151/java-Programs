import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program33{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("names.txt");

            System.out.println("Enter names (type 'END' to stop):");

            while (true) {
                String name = scanner.nextLine();

                if (name.equalsIgnoreCase("END")) {
                    break;
                }
                writer.write(name + "\n");
            }
            writer.close();
            System.out.println("Names have been written to names.txt");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}

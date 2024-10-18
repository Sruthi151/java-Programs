import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the filename (e.g., Marks.txt): ");
        String filename = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println("Processing line " + lineNumber + ": " + line);
                String[] marks = line.split(",");

                int total = 0;
                boolean validLine = true;  
                for (String mark : marks) {
                    try {
                        int score = Integer.parseInt(mark.trim());
                        total += score;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number found: '" + mark.trim() + "' in line " + lineNumber + ". Skipping...");
                        validLine = false;
                    }
                }
                if (validLine) {
                    System.out.println("Total marks for line " + lineNumber + ": " + total);
                }

                lineNumber++;
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}

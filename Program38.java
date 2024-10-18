import java.io.*;
import java.nio.file.*;

public class Program38 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter filename: ");
            String filename = br.readLine();
            String content = new String(Files.readAllBytes(Paths.get(filename)));
            Files.write(Paths.get(filename), content.toUpperCase().getBytes());
            
            System.out.println("File content converted to uppercase successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

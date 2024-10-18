import java.io.*;
import java.util.*;

public class Program40 {
    public static void main(String[] args) {

        Set<String> uniqueNames = new LinkedHashSet<>();
        readNamesFromFile("names1.txt", uniqueNames);
        readNamesFromFile("names2.txt", uniqueNames);
        System.out.println("Unique names from both files:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }

    // Method to read names from a file and add them to the set
    private static void readNamesFromFile(String filename, Set<String> uniqueNames) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                uniqueNames.add(line.trim());  
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + filename);
            e.printStackTrace();
        }
    }
}

import java.io.*;
import java.util.*;

public class Program39 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
            Set<String> uniqueNames = new TreeSet<>(); 
            String line;
            while ((line = reader.readLine()) != null) {
                uniqueNames.add(line.trim());
            }
            reader.close();
            System.out.println("Unique names in sorted order:");
            for (String name : uniqueNames) {
                System.out.println(name);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

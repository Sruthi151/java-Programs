import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Program37 {
    public static void main(String[] args) {
        Random random = new Random();
        
        try {
            FileWriter writer = new FileWriter("Marks.data");
            for (int i = 1; i <= 20; i++) {
                int mark = random.nextInt(101);  
                writer.write(mark + "\n"); 
            }
            writer.close();
            System.out.println("Successfully wrote 20 marks to Marks.data");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

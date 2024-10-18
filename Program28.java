import java.util.*;
import java.util.ArrayList;

public class Program28 {
    String product;
    double price;

public Program28(String product,double price) {  
        this.product = product;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Prog [product=" + product + ", price=" + price + "]";
    }
   public static void main(String[] args){
        List<Program28> prog = new ArrayList<>();
        prog.add(new Program28("Soap",50.50));
        prog.add(new Program28("Brush",40.00));
        prog.add(new Program28("Perfume",140.00));
        prog.add(new Program28("Biscuits",70.00));
        prog.add(new Program28("Powder",80.00));
        prog.add(new Program28("Chocolates",100.00));
        prog.sort((Program28 p1,Program28 p2)->Double.compare(p1.price,p2.price));
        System.out.println("Sorted by price:");
        for (Program28 item : prog) {
            System.out.println(item);  
        }
    }
}

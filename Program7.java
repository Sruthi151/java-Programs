import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int r,sum=0;
        while(n!=0)
        {
         r=n%10;
         sum=(sum*10)+r;
         n=n/10;
        }
        System.out.println("the reverse order the given number is:"+sum);
    }
}
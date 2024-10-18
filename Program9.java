import java.util.Scanner;

public class Program9 {
    static int n;
    static int big=0;
   static int large(int[] a)
    {
   for(int i=0;i<n;i++)
   {
    if(a[i]>big)
    {
        big=a[i];
   }
}
   return big;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enterthe numbers:");
         n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" numbers"); 
    
    for (int i=0;i<n;i++)
    {
    a[i]=sc.nextInt();
    }
    System.out.println("The largest numberis:"+Program9.large(a));
    }

}

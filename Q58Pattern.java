/*
               1
             2 3
           4 5 6
         7 8 9 10

  */

  import java.util.Scanner;
public class Q58Pattern {
     
    public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of n:");
    int n = sc.nextInt();

    int num = 1;
    for(int row=1; row<=n; row++)
    {
        for(int space = n; space>row; space--)
        {
            System.out.print("  ");
        }

        for(int star=1; star<=row; star++)
        {
            System.out.print(num + " ");
            num++;
        }

        System.out.println();
    }
   }
}
    


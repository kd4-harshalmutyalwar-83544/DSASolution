  /*
               1
             2 2
           3 3 3
         4 4 4 4

  */

import java.util.Scanner;

public class Q57Pattern 
{
    public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of n:");
    int n = sc.nextInt();

    for(int row=1; row<=n; row++)
    {
        for(int space = n; space>row; space--)
        {
            System.out.print("  ");
        }

        for(int star=1; star<=row; star++)
        {
            System.out.print(row + " ");
        }

        System.out.println();
    }
   }
}

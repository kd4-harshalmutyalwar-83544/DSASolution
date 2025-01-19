/*
             1 
           1 2 1
         1 2 3 2 1
       1 2 3 4 3 2 1
       for n=4

*/

import java.util.Scanner;

public class Q59Pattern 
{
     public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of n:");
    int n = sc.nextInt();

    for(int row=1; row<=n; row++)
    {
        for(int space=n; space>row; space--)
        {
            System.out.print("  ");
        }

        for(int star=1; star<=row; star++)
        {
            System.out.print(star + " ");
        }

        for(int star=row-1; star>=1; star--)
        {
            System.out.print(star + " ");
        }

        System.out.println();
    }
   }
}

/*
   9 8 7
   6 5 4
   3 2 1

   where n = 3.
 */

import java.util.Scanner;

public class Q18Pattern 
{
    public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter value of n:");
    int n = sc.nextInt();

    int m = n*n;

    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {
            System.out.print(m + " ");
            m--;
        }

        System.out.println();
    }
    
}
}

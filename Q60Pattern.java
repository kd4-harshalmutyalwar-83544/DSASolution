/*
         1 2 3 4 5 5 4 3 2 1 
         1 2 3 4 * * 4 3 2 1 
         1 2 3 * * * * 3 2 1 
         1 2 * * * * * * 2 1 
         1 * * * * * * * * 1

        for n = 5;

*/

import java.util.Scanner;

public class Q60Pattern 
{
     public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of n:");
    int n = sc.nextInt();

    for(int row = 1; row<=n; row++)
    {
        for(int j=1; j<=n; j++)
        {
            if(j<=n-row +1)
            System.out.print(j);
            else
            System.out.print("*");
        }

        for(int k=n; k>=1; k--)
        {
            if(k> n- row + 1)
            System.out.print("*");
            else
            System.out.print(k);
        }
        System.out.println();
    }
   }
}

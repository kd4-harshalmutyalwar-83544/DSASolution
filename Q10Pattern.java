/*
   1 2 3 4
   1 2 3 4
   1 2 3 4
   1 2 3 4 
 
*/

import java.util.Scanner;
public class Q10Pattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n:");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
    
}
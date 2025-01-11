/*
 A A A A
 B B B B 
 C C C C
 D D D D
FOR n=4

*/

import java.util.Scanner;
public class Q29Pattern 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print( (char)(65 + i-1) + " ");
            }
            System.out.println();
        }
    }
}

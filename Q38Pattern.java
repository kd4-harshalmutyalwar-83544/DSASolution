/* 
A
B B
C C C
For n=3

*/

import java.util.Scanner;
public class Q38Pattern 
{ 
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of n:");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print((char)(65+i-1) + " ");
        }
        System.out.println();
    }
   }  
}

/*
    * * * *
    * * *
    * *
    *
    for n = 4
*/

import java.util.Scanner;
public class Q50Pattern 
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the value of n:");
     int n = sc.nextInt();

     for(int i=1; i<=n; i++)
     {
        for(int j=n; j>=i; j--)
        {
            System.out.print("* ");
        }
        System.out.println();
     }
   }    
}

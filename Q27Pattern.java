/*
 1
 2 3
 3 4 5
 4 5 6 7

 for n = 4
*/

import java.util.Scanner;
public class Q27Pattern 
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
            System.out.print(i+j -1 + " ");
         }
         System.out.println();
       }
   }    
}

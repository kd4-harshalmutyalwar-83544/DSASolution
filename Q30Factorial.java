// Write a program to find the FACTORIAL of a given number?

import java.util.Scanner;
public class Q30Factorial 
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the value of n:");
       int n = sc.nextInt();

       long fact = 1;

       for(int i=1; i<=n; i++)
       {
          fact = fact * i;
       }

       System.out.print("Factorial of " + n + " is : " + fact);
   }   
}

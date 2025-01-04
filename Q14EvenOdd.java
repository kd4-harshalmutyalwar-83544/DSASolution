// Write a program to Check given number is even or odd.

import java.util.Scanner;

public class Q14EvenOdd 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the number:");
       int n = sc.nextInt();

       if(n % 2 == 0)
       {
         System.out.println("Number is Even.");
       }
       else
       {
        System.out.println("Number is Odd");
       }
    }
}

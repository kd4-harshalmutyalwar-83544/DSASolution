// Write a program to find the FACTORIAL of a given RANGE of numbers?

import java.util.Scanner;
public class Q31FactorialOfRange 
{
    public static long factorial(long n)
    {
        long fact = 1;
        for(int i=1; i<=n; i++)
        {
            fact = fact * i;
        }
        return fact;
    }
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the value of n:");
      long n = sc.nextInt();

      for(long i=1; i<=n; i++)
      {
          System.out.print("\nFactorial of " + i + " is :" + factorial(i));
      }
      
   }    
}

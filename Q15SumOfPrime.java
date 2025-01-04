//Write a program to print sum of prime number.

import java.util.Scanner;
public class Q15SumOfPrime 
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the value of n:");
     int n = sc.nextInt();
   
     int sum = 0;
     for(int i=1; i<=n; i++)
     {
        if(isPrime(i))
        {
            sum = sum + i;
        }
     }
     System.out.println("Sum is:" + sum);

     
   }  
   
   public static boolean isPrime(int n)
     {
        if(n==1)
        return false;
        for(int i=2; i<n; i++)
        {
        
            if(n%i == 0 )
            {
               return false;
            }
        }
        return true;
     }
}

//Write a program to check the given number is PRIME PALINDROME or not

import java.util.Scanner;
public class Q43PrimePalindrome 
{
    public static boolean isPrime(int n)
    {
        if(n<=1) 
           return false;
        for(int i=2; i<n; i++)
        {
        if(n % i == 0)
          return false;
        }

        return true;
    }

    public static boolean isPalindrome(int n)
    {
        int temp = n;

      int rev = 0;

      while(n!=0)
      {
        rev = rev * 10 + (n%10);
        n = n/10;
      }
      return temp == rev;
         
    }
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of n:");
    int n = sc.nextInt();

    if(isPrime(n))
    {
      if(isPalindrome(n))
      {
        System.out.print("Number is Prime Palindrome");
      }
       else
       {
         System.out.print("Number is prime But Not Palindrome");
       }
        
    }
    else
    {
        System.out.print("Number is not prime");
    }
}

}

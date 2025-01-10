
//Write a program to check given number is palindrome or not
import java.util.Scanner;
public class Q25PalindromeNumber
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the value of n:");
     int n = sc.nextInt();

     int temp = n;
     int rev = 0;
     
     while(n!=0)
     {
         rev = rev*10 + (n%10);
         n = n/10;
     }

     if(temp == rev)
     {
        System.out.println(temp +" is a Palindrome");
     }
     else
     {
        System.out.println(temp + " is not palindrome");
     }

  }  
}

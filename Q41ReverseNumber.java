//Write a program to REVERSE the number

import java.util.Scanner;
public class Q41ReverseNumber 
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
           rev = rev *10 + (n % 10);
           n = n/10;
        }
        System.out.print("Reverse of " + temp + " is : " + rev );
    }  
}

/*  
Write a program to display FIBONACCI series of a number?
Def:	a	series	of	numbers	in	which	each	number	(	Fibonacci number	)	is	the	sum	of	the	two	
preceding	numbers.	The	simplest	is	the	series	1,	1,	2,	3,	5,	8,	etc.	
 */

import java.util.Scanner;
public class Q34Fibonacci 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci series: " + a + " " + b);

        for(int i =2; i<=n; i++)
        {
            int c = a+b;
            a = b; 
            b = c;
            System.out.print(" " + c);
        }
    }
}

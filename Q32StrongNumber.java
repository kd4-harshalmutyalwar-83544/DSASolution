/*
Write program to check the given number is STRONG or not?
Def: Strong numbers	are	the	numbers	whose	sum	of	factorial	of	digits	is	equal	to	the	
original	number.		
Example:	145	is	a	strong number
*/


import java.util.Scanner;
public class Q32StrongNumber 
{
    
    public static int factorial(int n)
    {
        int fact = 1;
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
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        while(n != 0)
        {
            int r = n % 10;
            sum = sum + factorial(r);

            n = n/10;
        }

        if(sum == temp)
        {
            System.out.println(temp + " is Strong Number");
        }
        else
        {
            System.out.println(temp + " is Not Strong Number");

        }
    }
}

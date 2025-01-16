/*
 Write a Program to check the given number is ARMSTRONG or not?
 Def: An	Armstrong	number	is	an	integer	such	that	the	sum	of	the	power	of	its	
 digits	is	equal	to	the	number	itself.	
 For	example,	371	is	an	Armstrong	number	since	3**3	+	7**3	+	1**3	=	371.		
 9	is	an	Armstrong	number	since	9*1=	9.	
*/

import java.util.Scanner;
public class Q44ArmstrongNumber 
{
    public static boolean isArmStrong(int n)
    {
        int digit = countDigit(n);
        
        int temp = n;
        int sum = 0;

        while(temp!=0)
        {
           int r = temp % 10;
           sum = sum + pow(r, digit);
           temp = temp/10;
        }
       // System.out.println(sum);
        return n == sum;
    }
    

    public static int countDigit(int n)
    {
        int count =0;
         while(n!=0)
         { 
            count ++;
            n = n/10;
         }
        // System.out.println(count);
         return count;
    }


    public static int pow(int n, int p)
    {
        int pw = 1;
        while(p!=0)
        {
            pw = pw * n;
            p--;
        }
        return pw;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        if(isArmStrong(n))
        {
            System.out.println(n +" is Armstrong number");
        }
        else
        {
            System.out.println(n + " is not an Armstrong number");
        }
        
    }
}

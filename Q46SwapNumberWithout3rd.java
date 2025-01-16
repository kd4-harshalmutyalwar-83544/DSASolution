// Write a program to Swap two numbers without using 3rd variable?

import java.util.Scanner;
public class Q46SwapNumberWithout3rd 
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in); 

    System.out.println("Enter the value of a and b:");
    int a = sc.nextInt(); // a=10
    int b = sc.nextInt(); // b =20

    System.out.print("\nBefore Swap: a = " + a + " b = " + b);
    
     a = a+b;  // a = 10+20 =  30
     b = a-b;  // b = 30-20 = 10
     a = a-b;  // a = 30-10 = 20

     System.out.print("\nAfter Swap: a = " + a + " b = " + b);


    } 
}

// Write a Program to display multiplication table.

import java.util.Scanner;
public class Q21MultiplicationTable 
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the value of n:");
     int n = sc.nextInt();

     for(int i =1; i<=10; i++)
     {
        System.out.println(i + " X " + n + " = " + (i*n));
     }

   }    
}

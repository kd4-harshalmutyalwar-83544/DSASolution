//Write a program to convert DECIMAL to BINARY?

import java.util.Scanner;
public class Q53DecimalToBinary 
{
   public static void main(String args[])  
   {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Decimal number:");
     int n = sc.nextInt();

     if(n == 0)
     System.out.println("Binary equivalent is: 0");
     else
     {
     String bin = "";

     while(n != 0)
     {
        bin = n%2 + bin;  // here write n%2 first to correct order.
        n = n/2;
     }
    
     System.out.println("Binary equivalent of: " + bin);
   } 
} 
}

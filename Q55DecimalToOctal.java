// Write a program to convert DECIMAL to OCTAL

import java.util.Scanner;
public class Q55DecimalToOctal 
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the decimal number");
      int n = sc.nextInt();
      
      if(n == 0)
      {
        System.out.println("Ocatal equivalent is: 0");
      }
      else
      {
      String oct = "";

      while(n != 0)
      {
        oct = (n % 8) + oct; 

        n = n / 8; 

      }
      System.out.println("octal equivalent is:" + oct);
   }  
}  
}


/*
 Explanation:  166 % 8 |  = 6
               
               
*/
//Write a program to convert DECIMAL to HEXADECIMAL

import java.util.Scanner;

public class Q61DecimalToHexadecimal 
{
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Decimal number:");
    int n = sc.nextInt();

    String hex = "";

    while(n != 0)
    {
        int r =  (n % 16) ;
        switch(r)
        {
            case 10: hex = "A" + hex;
                   break;
                   
            case 11: hex = "B" + hex;
                   break;

            case 12: hex = "C" + hex;
                   break;
                   
            case 13: hex = "D" + hex;
                   break;
                   
            case 14: hex = "E" + hex;
                   break;
                   
            case 15: hex = "F" + hex;
                   break;
                   
            default: hex = r + hex;
                   break;
        }

        n = n/16;
    }

    System.out.println("Hexadecimal equivalent is:" + hex);
    
   }
}


/*
    Given: Decimal number = 450(10)


Step 1: 450/16 gives Q1 = 28 and R1 = 2


Step 2: 28/16 gives Q2 = 1 and R2 = 12 = C


Step 3: 1/16 gives Q3 =  0 and R3 = 1


Step 4: 0/16 gives Q4 =  0 and R4 = 0


Therefore, the hexadecimal value is 01C2(16)
*/
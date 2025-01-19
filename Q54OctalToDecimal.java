// Write a program to convert OCTAL to DECIMAL.

 import java.util.Scanner;
public class Q54OctalToDecimal 
{
    public static boolean isOctal(int n)
    {
        while(n!=0)
        {
         if(n%10 > 7)
           return false;
        n = n / 10;
        }
        return true;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter octal number:");
        int n = sc.nextInt();

        if(isOctal(n))
        {
        int decimal = 0;
        int mul = 1;

        while(n != 0)
        {
            decimal = decimal + (n%10) * mul;
            mul = mul * 8;
            n = n/10;
        }

        System.out.println("Decimal equivalent :" + decimal);
    }
    else 
       System.out.println("Number is not an Octal number");
    }
}


/*
   Explanation:  octal to decimal:      n*8 , 482 ,64 ,8 , 1  --> number multiply by 8.
*/
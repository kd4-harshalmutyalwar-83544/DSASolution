// Write a program to convert BINARY to DECIMAL

import java.util.Scanner;
public class Q52BinaryToDecimal 
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the binary number:");
    long n = sc.nextLong();

    long decimal = 0;
    int division = 1;

    while(n != 0)
    {
        decimal = decimal + (n % 10) * division;
        n = n /10;
        division = division*2;
    }

    System.out.print("decimal equivalent is:"+ decimal);
    }

}

/* 
// Helper method to check if the input is a binary number
private static boolean isBinary(long n) {
    while (n != 0) {
        if (n % 10 > 1) {
            return false; // If any digit is greater than 1, it's not binary
        }
        n /= 10;
    }
    return true;

    */
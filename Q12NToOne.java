// write a program from n to 1.

import java.util.Scanner;

public class Q12NToOne 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        for(int i=n; i>=1; i--)
        {
            System.out.print(i + " ");
        }
    }
}

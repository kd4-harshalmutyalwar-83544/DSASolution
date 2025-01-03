//write a program to print value from 1 to n.

import java.util.Scanner;
public class Q11OneToN
 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            System.out.print(i + " ");
        }
    }
}

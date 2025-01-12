/* 
A B C
A B C
A B C
For n=3

*/

import java.util.Scanner;
public class Q35Pattern
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a value of n:");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {
            System.out.print((char)(65+ j -1) + " ");
        }

        System.out.println();
    }
    }
}

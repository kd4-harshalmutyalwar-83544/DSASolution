/* 
A B C
B C D
C D E
For n=3

*/

import java.util.Scanner;
public class Q37Pattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int m;

        for(int i=1; i<=n; i++)
        {
            m=i;
            for(int j=1; j<=n; j++)
            {
                System.out.print((char)(65 + m -1) + " ");
                m++;
            
            }
            System.out.println();
        }
    }
}

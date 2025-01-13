
/* 
A
B C
C D E
D E F G
For n=4
*/

import java.util.Scanner;
public class Q40Pattern 
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

        for(int j=1; j<=i; j++)
        {
           System.out.print((char) (65 +m -1) + " ");
           m++;
        }
        System.out.println();
    }
}
}

/* 
A 
B C
D E F
G H I J
For n=4
*/


import java.util.Scanner;
public class Q39Pattern 
{
    public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of n:");
    int n = sc.nextInt();
    int m=0;

    for(int i=1; i<=n; i++)
    {
        
        for(int j=1; j<=i; j++)
        {
            m++;
            System.out.print((char)(65 + m -1) + " ");
        
        }
        System.out.println();
    }
   }
}

/* 
A B C
D E F
G H I
For n=3

*/

import java.util.Scanner;
public class Q36Pattern 
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the value of n:");
     int n = sc.nextInt();
     int m=0;

     for(int i=1; i<=n; i++)
     {
        for(int j=1; j<=n; j++)
        {
            System.out.print((char) (65+ m) + " ");
            m++;
        }
        System.out.println();
     }
   }   
}

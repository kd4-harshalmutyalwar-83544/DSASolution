/*
D
C D
B C D
A B C D
For n=4

*/

import java.util.Scanner;
public class Q48Pattern 
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the value of n:");
      int n = sc.nextInt();

      for(int i=1; i<=n; i++)
      {
        char ch = (char) (65+n-i);
        for(int j=1; j<=i; j++)
        {
            System.out.print(ch + " ");
            ch++;
        }
        System.out.println();
      }
   }    
}

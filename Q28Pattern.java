/* 

1
2 1
3 2 1
4 3 2 1
For n=4

*/

import java.util.Scanner;

public class Q28Pattern
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
   
       System.out.println("Enter the value of n:");
       int n = sc.nextInt();

       for(int i=1; i<=n; i++)
       {
          for(int j=i; j>=1; j--)
          {
            System.out.print(j + " ");
          }

          System.out.println();
       }
    }

}

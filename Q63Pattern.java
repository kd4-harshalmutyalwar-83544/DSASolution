/*
   
      * * * * * * *
      *			  *
      *			  *
      *			  *
      *			  *
      *			  *
      * * * * * * *
      for n = 7
*/

import java.util.Scanner;
public class Q63Pattern 
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of n:");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {
            if(j==1 || j==n || i==1 || i==n)
            System.out.print("* ");
            else
            System.out.print("  ");
        }
        System.out.println();
    }
    }
}

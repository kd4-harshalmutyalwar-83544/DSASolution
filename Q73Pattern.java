/*
 
                                          *					*	
                                          * *			  * *	
                                          * * *			* * *	
                                          * * * *	  * * * *	
                                          * * * * * * * * * *

                                          for n = 5
*/

import java.util.Scanner;
public class Q73Pattern
{
   public static void main(String args[])
   { 
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the value of n:");
   int n = sc.nextInt();
   
   int col = n*2;

   for(int i=1; i<=n; i++)
   {
    for(int j=1; j<=col; j++)
    {
        if(j <= i || j >= (col -i +1) )
        {
            System.out.print("* ");
        }
        else
        {
            System.out.print("  ");
        }
    }
    System.out.println();
   }
   }
}

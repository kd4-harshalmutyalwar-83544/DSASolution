/*
        
	 		         *	
				     * * *	
				   * * * * *	
			   * * * * * * *	
			     * * * * *	
				     * * *	
					     *
          for n=7
*/

import java.util.Scanner;
public class Q69Pattern 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of n:");
    int n = sc.nextInt();

    int spaces = n/2;
    int star = 1;

    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=spaces; j++)
        {
            System.out.print("  ");
        }

        for(int k=1; k<=star; k++)
        {
            System.out.print("* ");
        }

        System.out.println();

        if(i <= n/2)
        {
          spaces--;
          star +=2;

        }
        else
        {
         spaces++;
         star -=2;
        }

    }
  }   
}

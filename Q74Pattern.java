/*
      enter	the	rows:	5	
              1	
              2	3	
              4 5 6	
              7 8 9 10	
              11 12 13 14 15

*/

import java.util.Scanner;
public class Q74Pattern 
{
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the row:");
    int n = sc.nextInt();
    
    int m = 1;
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print(m+ " ");
            m++;
        }
        System.out.println();
    }
   }    
}

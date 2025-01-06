/*
 1 2 3
 4 5 6
 7 8 9
 
 where n = 3
 
*/
 import java.util.Scanner;
public class Q17Pattern 
{
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter value of n:");
    int n = sc.nextInt();
     int m=0;
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {
            m++;
            System.out.print(m + " ");
        }

        System.out.println();
    }
   } 
}

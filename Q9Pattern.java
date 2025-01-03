/*
 1 1 1
 2 2 2
 3 3 3 
 
*/
import java.util.Scanner;
class Q9Pattern
{
    public static void main(String args[])
    {
        System.out.println("Enter value of n:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
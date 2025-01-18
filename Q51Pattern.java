 /*
      * * * * *
        * * * *
          * * *
            * *
              *
    for n = 5;
 */
import java.util.Scanner;
public class Q51Pattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++)
        {
            for(int space=1; space<i; space++)
            {
                System.out.print("  ");
            }
            for(int star=n; star>=i; star--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
}

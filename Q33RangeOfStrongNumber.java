// Write program weather to find range of STRONG NUMBER?

import java.util.Scanner;

public class Q33RangeOfStrongNumber 
{
    public static int factorial(int n)
    {
        int fact = 1;
        for(int i=1; i<=n; i++)
        {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Range:");
        int n = sc.nextInt();
        

        for(int i=1; i<=n; i++)
        {
        int temp = i;
        int sum = 0;

        while(temp != 0)
        {
            int r = temp % 10;
            sum = sum + factorial(r);

            temp = temp/10;
        }

        if(sum == i)
        {
            System.out.println(i + " is Strong Number");
        }
    }
        
    }
}

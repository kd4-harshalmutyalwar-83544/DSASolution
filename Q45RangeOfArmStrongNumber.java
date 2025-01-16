// Write a Program to display the range of ARMSTRONG numbers

import java.util.Scanner;

public class Q45RangeOfArmStrongNumber 
{
     public static boolean isArmStrong(int n)
    {
        int digit = countDigit(n);
        
        int temp = n;
        int sum = 0;

        while(temp!=0)
        {
           int r = temp % 10;
           sum = sum + pow(r, digit);
           temp = temp/10;
        }
       // System.out.println(sum);
        return n == sum;
    }
    

    public static int countDigit(int n)
    {
        int count =0;
         while(n!=0)
         { 
            count ++;
            n = n/10;
         }
        // System.out.println(count);
         return count;
    }


    public static int pow(int n, int p)
    {
        int pw = 1;
        while(p!=0)
        {
            pw = pw * n;
            p--;
        }
        return pw;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the range n:");
        int n = sc.nextInt();
       
        for(int i=0; i<=n; i++)
        {
        if(isArmStrong(i))
        {
            System.out.println(i +" is Armstrong number");
        }
    }
        
    }
}

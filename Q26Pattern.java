/*
 1
 2 3
 4 5 6
 7 8 9 10

 for n=4.
*/

import java.util.Scanner;
public class Q26Pattern
 {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the value of n:");
       int n = sc.nextInt();
       
       int m=0;
       for(int i=1; i<=n; i++)
       {
        for(int j=1; j<=i; j++)
        {
            m++;
            System.out.print(m + " ");
           // System.out.print(((i * (i - 1)) / 2) + j + " ");  //without using 3rd variable.
        }
        System.out.println();
       }
    }
}

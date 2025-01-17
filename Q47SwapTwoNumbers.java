// Write a program to Swap two numbers with using 3rd variable?

import java.util.Scanner;
public class Q47SwapTwoNumbers 
{
    public static int[] Swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;

        return new int[] {a, b};
    }
    public static void main(String args[])
    {
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the value of a and b:");
   int a = sc.nextInt();
   int b = sc.nextInt();
   
   System.out.println("Before Swap: a= " + a + " b = " + b);
   int swappedValue[] = Swap(a, b);
   
   a = swappedValue[0];
   b = swappedValue[1];
   System.out.println("After Swap: a= " + a + " b = " + b);
   

    }
}

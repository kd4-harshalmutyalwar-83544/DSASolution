// Write program weather the number is PERFECT NUMBER or not?

import java.util.Scanner;
public class Q23PerfectNumber 
{
    public static void main(String args[])
    {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the value of n:");
  int n = sc.nextInt();

  int sum = 0;

  for(int i=1; i<=n/2; i++)
  {
    if(n%i == 0)
    {
        sum = sum + i;
    }
  }

   if(sum == n)
   {
   System.out.println("Number is Perfect number");
   }
   else
   {
   System.out.println("Number is not a perfect Number");
   }
    }

}
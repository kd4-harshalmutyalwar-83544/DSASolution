//Farenheit to celcius

import java.util.Scanner;
 public class Q6FarenheitToCelcius
{
  public static void main(String argd[])
  {
    double c;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Farenheit:");
    double f = sc.nextDouble();

    c = (5.0/9)*(f-32);

    System.out.println(f + " farenheit = " + c + " celcius");
    sc.close();
  }
}
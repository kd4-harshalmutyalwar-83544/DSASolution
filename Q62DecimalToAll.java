// Write a program to convert DECIMAL to ALL(Octal , Hexa and Binary)

import java.util.Scanner;
public class Q62DecimalToAll 
{
    public static String convert( int base, int n)
    {
     String	st="0123456789ABCDEF";	
	 String	b="";	
	 while(n != 0)	
	 {	
	 	 int r=	n %	base;	
	 	 b =st.charAt(r)+b;	
	 	 n = n/base;	
			
	 }	
	 return	b;	
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        System.out.println("Enter the base:");
        int base = sc.nextInt();

        System.out.println(base + " base equivalent :" + convert(base, n));

    }
}

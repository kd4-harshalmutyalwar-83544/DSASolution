// Write program weather the string is PANAGRAM or not
//Def: a sentence containing every letter of the alphabet

import java.util.Scanner;
public class Q84Panagram 
{
    public static String removeSpaces(String str)
    {
        char ch[] = str.toCharArray();

        String newString = "";

        for(int i=0; i<ch.length; i++)
        {
            if(ch[i] != ' ')
            {
                newString = newString + ch[i];
            }
        }
        return newString;
    }

    public static boolean check(String Str)
    {
        
        for(char i= 'A'; i<='Z'; i++)
        {
              if((Str.indexOf(i) < 0) && (Str.indexOf((char)(i+32)) < 0))
              {
                return false;
              }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sc.nextLine();

         String st = removeSpaces(str);

         boolean d = check(st);

         if(d)
         {
             System.out.println("String is Panagram");
         }
         else
         {
            System.out.println("String is not Panagram");
         }
    }
}

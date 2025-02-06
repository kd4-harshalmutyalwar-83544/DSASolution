// Write a program to find weather a string is ANAGRAM or not
// Def: a word, phrase, or name formed by rearranging the letters of another, such as silent formed from listen.	

import java.util.Scanner;
public class Q83StringAnagram 
{
    public static String removeSpaces( String str)
    {
          char ch[] = str.toCharArray();

          String newstr = "";

          for(int i=0; i<ch.length; i++)
          {
            if(ch[i] != ' ')
            {
                newstr = newstr + ch[i];
            }
          }
          return newstr;
    }

    public static String toLowerCase(String s1)
    {
        char ch[] = s1.toCharArray();

        String newStr = "";

        for(int i=0; i<ch.length; i++)
        {
            if(ch[i] >= 65 && ch[i] <= 90 )
            {
                newStr = newStr + ((char)ch[i] + 32); //if uppercase convert in lower case.
            }
            else
            {
               newStr = newStr + ch[i]; //if in lower case then no need to convert.
            }
        }
        return newStr;

    }


    public static String sort(String s1)
    {
        char ch[] = s1.toCharArray();

        for(int i=0; i<ch.length-1; i++)
        {
            for(int j= i+1; j<ch.length; j++)
            {
                if(ch[i] > ch[j])
                {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        String newStr = new String(ch);
        return newStr;
    }

    public static boolean compare(String s1, String s2)
    {
        if(s1.length() != s2.length())
             return false;
        else
        {
            s1 = toLowerCase(s1);
            s2 = toLowerCase(s2);

            s1 = sort(s1);
            s2 = sort(s2);

            char ch1[] = s1.toCharArray();
            char ch2[] = s2.toCharArray();

            for(int i=0; i<ch1.length; i++)
            {
                if(ch1[i] != ch2[i])
                {
                    return false;
                }
            }

            return true;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter a Second string:");
        String s2 = sc.nextLine();

        s1 = removeSpaces(s1);
        s2 = removeSpaces(s2);

        boolean b = compare(s1, s2);

        if(b)
        {
            System.out.println("String is anagram");
        }
        else
        {
            System.out.println("String is not anagram");
        }
    }
}

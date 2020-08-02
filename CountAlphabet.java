import java.util.*;
public class CountAlphabet
{
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   int vow=0,consent=0,splchr=0,i=0;
   String s = sc.nextLine();
   s=s.toLowerCase();
   int size=s.length();
   while(i!=size)
   {
    if(s.charAt(i)>='a'&&s.charAt(i)<='z')
    {
      if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
      {
         vow++;
      }
      else
      {
         consent++;
      }
    }
    else
    {
       splchr++;
    }
    i++;
   }
   System.out.println("No.of Vowels in the given string is : "+vow);
   System.out.println("No.of Consonants in the given string is : "+consent);
   System.out.println("No.of Special Characters in the given String is : "+splchr);
 }
}

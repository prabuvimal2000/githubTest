import java.util.*;
public class CheckLetter
{
 public static void main(String[] args)
 {
    Scanner sc= new Scanner(System.in);
    Character ch = sc.next().charAt(0);
    //here we can also use lowercase=uppercase-32
    if (ch>=65 && ch<=90)
    {
        System.out.println("Enterd Character " + ch +" is a Upper case the Ascii value is  "+(int) ch);
    }
    else if (ch>=97&&ch<=122)
    {
        System.out.println("Enterd Character " + ch +" is a Lower case the Ascii value is "+(int) ch);
     }
    else if (ch>=48&&ch<=57)
    {
        System.out.println("Entered Character "+ch+" is a Number the Ascii value is "+(int) ch);
     }
     else
      System.out.println("Enterted chracter "+ch +" is a Symbol the Ascii value is "+(int) ch);               
  } 
}

import java.util.*;
public class StringType
{
 public static void choice(int ch,String s)
 {
     switch(ch)
     {
        case 1:
            System.out.println(s.toUpperCase());
            break;
        case 2:
            System.out.println(s.toLowerCase());
            break;
        case 3:
            System.out.println(s.replaceAll("\\s",""));
            break;
        default:
            System.out.println("OOPS! Your Entered Invalid option");
     }
 }
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   String c=sc.nextLine();
   System.out.println("Enter the choice to convert your string to Upper or Lower \n 1 for Upper\n 2 for Lower\n 3 for Remove spaces ");
   int ch= sc.nextInt();
   choice(ch,c);
 }
}

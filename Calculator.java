import java.util.*;
public class Calculator
{
  public static void opeartion(char ch,double a,double b)
  {
     switch(ch)
     {
         case  '+':
             System.out.println(a+b);
             break;
         case '-':
             System.out.println(a-b);
             break;
         case '*':
            System.out.println(a*b);
            break;
         case '/':
           System.out.println(a/b);
           break;
         case '^':
           System.out.println(Math.pow(a,b));
           break;
         default:
          System.out.println("Invalid operater");
     }
  }
  public static void main(String[] args)
 {
   Scanner sc = new Scanner (System.in);
   double num1= sc.nextDouble();
   char  ch = sc.next().charAt(0);
   double num2=sc.nextDouble();
   opeartion(ch,num1,num2);
 }
}

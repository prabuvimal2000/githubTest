import java.util.*;
import java.io.*;//swap without third variable
public class Swap
{
 public static void main(String[] args) throws Exception
 {
     BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
     int a, b;
     a=Integer.parseInt(input.readLine());
     b=Integer.parseInt(input.readLine());  
     System.out.println(a+" "+b);
   /*  a=a+b;
     b=a-b;
     a=a-b; 
*/
   /*  a=a*b;
     b=a/b;
     a=a/b;
*/
   //a=(a*b)/(b=a);
  a=(a+b)-(b=a);
     System.out.print(a+" "+b);
 }
}

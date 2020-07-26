import java.util.*;
public class Main
{  
 public static void main (String[] args) 
  {
    Scanner sc = new Scanner (System.in);
    int num =sc.nextInt();
    int num1=0,num2=1;
    while(num1<=num)
    {
       System.out.print(num1+" ");
       int sum=num1+num2;
       num1=num2;
       num2=sum;
     }
  }
}

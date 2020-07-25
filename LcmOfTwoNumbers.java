import java.io.*;
//Lcm of Two numbers
public class LcmOfTwoNumbers
{
  public static void main(String[] args) throws Exception
 { 
         BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
         int a,b,lcm,flag=1;
         System.out.println("Enter the First number : ");
         a=Integer.parseInt(input.readLine());
         System.out.println("Enter the Second number :");
         b=Integer.parseInt(input.readLine());
         while(flag!=0)  
         {
              lcm = (a>b)?a:b;
              if (lcm%a==0 && lcm%b==0)
              {       
                     System.out.println("The lcm of two number is : "+lcm);
                     flag=0;
                     break;
               }
             lcm++;
         } 
  }
}

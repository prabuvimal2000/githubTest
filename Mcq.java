import java.util.*;
public class Mcq
{
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Choose the correct answer who are real heros");
   String[]  a= {"1.Doctors&Soldiers","2.Theif&Police","3.Batman&Captain","4.Rajini&kamal"};
   for(int i=0;i<a.length;i++)
   {
       System.out.println(a[i]);
   }
   int num=sc.nextInt();
  if(num<=a.length)
  {
   for(int i=0;i<a.length;i++)
   {
      if(a[0]==a[num-1])
      {
            System.out.println("Suprb! You are correct ");
             break;
       }
     else
      {
          System.out.println("Oops!  Wrong ans ");
          break;
       }
    }
   } 
   else
   {
       System.out.println("Entered a invalid option####");
    }
  }
}

/*
 * /*
 * Program for Find the given number factorial.
 * @author Prabu M
 * @since Jul 3 2021
 * 
 */
package javatraining;
import java.util.Scanner;
public class FindNumberOfFactorial
{
   public static void main(String args[])
   {
	    int number,count=0;
	    Scanner input=new Scanner(System.in);
        System.out.println("Enter the number :");
        number=input.nextInt();         
        if(number>0)
        { 
            for(int i=1;i<=number;i++)
            {
                if(number%i==0)
                {
                    number/=i;
                    count+=1;
                }
                else
                {
                	break;
                }
            }     
             if(number==1)
             {
                System.out.print(count);
             }
             else
             {
                System.out.print("Sorry.The given number is not a perfect factorial");
              }
         }
         else 
         {
           System.out.print("Invalid Input");
         } 
        input.close();
    }
}


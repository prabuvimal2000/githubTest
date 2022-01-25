/*
 * Program for Find the palindrome number in the given range.
 * @author Prabu M
 * @since Jul 3 2021
 * 
 */
package javatraining;
import java.util.Scanner;
public class PalindromeNumber 
{
	public static void main(String[] args)
	{
		int starRange,endRange;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the starting range number :");
		starRange=input.nextInt();
		System.out.println("Enter the ending range number :");
		endRange=input.nextInt();
	  for(int i=starRange;i<=endRange;i++)
	    {
	    	int temp=i,sum=0,reminder;
	    	while(temp!=0)
	    	{
	    		reminder=temp%10;
	    		sum=(sum*10)+reminder;
	    		temp/=10;
	    	}
	    	if(sum==i)
	    	{
	    		System.out.print(i+" ");
	    	}
	   }
		input.close();
	}
}

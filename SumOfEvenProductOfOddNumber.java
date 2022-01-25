/*
 * Program for Sum of even numbers and product of odd numbers between 1 to 10.
 * @author Prabu M
 * @since Jul 1 2021
 * 
 */ 
package javatraining;
import java.util.Scanner;
public class SumOfEvenProductOfOddNumber
{
	public static void main(String[] args)
	{
		int sumEven=0,productOdd=1;
		Scanner input=new Scanner(System.in);
		for (int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				sumEven+=i;
			}
			else
			{
				productOdd*=i;
			}
		}
		System.out.println("Sumof even number is : "+sumEven);
		System.out.println("Productof odd number is : "+productOdd);
		input.close();
	}
}

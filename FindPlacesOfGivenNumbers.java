/*
 * Program for find the places of given number.
 * @author Prabu M
 * @since Jul 1 2021
 * 
 */ 
package javatraining;
import java.util.Scanner;
public class FindPlacesOfGivenNumbers 
{
	public static void main(String[] args)
	{
		int num;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your number : ");
		num=input.nextInt();
		int place=0;
		do
		{
			int reminder, placeValue;
			reminder=num%10;
			num/=10;
			placeValue=(int)Math.pow(10,place);
			System.out.println("From your enterd number the "+reminder+" is in "+placeValue+" place Value");
			place+=1;
		}while(num>0);	
		input.close();
	}
}

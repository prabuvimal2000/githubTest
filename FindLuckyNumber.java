/*
 * Program for check whether the given four digit car number is lucky number or not.
 * The lucky number sum of digit is divided by any one of the following numbers there are 3 or 5 or 7.
 * If its divided by any one of above number then print as lucky number otherwise print that number is not a lucky number.
 * If the given number is not a four digit number then print it is a not valid car number.
 * @author Prabu M
 * @since Jun 29 2021
 */
package javatraining;
import java.util.Scanner;
public class FindLuckyNumber {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car number :");
		int car_Num=sc.nextInt();
		int sum=0,count=0;
		int num=car_Num;
		while (num>0 && count<4)
		{
			int rem =num%10;
			sum=sum+rem;
			num=num/10;
			count=count+1;
		}
		if (num==0 && count==4 && (sum%3==0 || sum%5==0 || sum%7==0))
		{
			System.out.println("Lucky Number");
		}
		else if (num ==0 && count==4)
		{
			System.out.println("Sorry its not my lucky number");
		}
		else
		{
			System.out.println(car_Num+" is not a valid car number");
		}
		sc.close();
	}
}

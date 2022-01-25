package exception;
import java.util.Scanner;
class InvalidDateException extends Exception
{
	InvalidDateException(String date)
	{
		super(date);
	}
}
public class MyDate
{
	private int date,month,year;
	MyDate(int date,int month,int year)
	{
		this.date=date;
		this.month=month;
		this.year=year;
	}
	public void displayDate() 
	{
		if(date<1||date>31|| month<1||month>12|| year<500)
		{
			try 
			{
				throw  new InvalidDateException("Invalid Date");
			}
			catch(InvalidDateException Exception) 
			{
				System.out.println(Exception.getMessage());
			}
		}
		else
		{
			System.out.println(date+"-"+month+"-"+year);
		}
	}
	public static void main(String args[])
	{
		int date,month,year;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the date : ");
		date=input.nextInt();
		System.out.println("Enter the month : ");
		month=input.nextInt();
		System.out.println("Enter the year : ");
		year=input.nextInt();
		MyDate datecheck=new MyDate(date,month,year);
		datecheck.displayDate();
		input.close();
	}
}


package javatraining;
import java.util.Scanner;
public class DisplayMonthAndDays {
	public static void main(String[] args)
	{
		int userChoice;
		Scanner input = new Scanner(System.in);
		System.out.println("Which you want to display\n1.Display Months\n2.Display Days\n3.Exit");
		String[] month= {"1.January","2.February","3.March","4.April","5.May","6.June","7.July","8.August","9.September","10.October","11.November","12.December"};
		String[] days= {"1.Sunday","2.Monday","3.Tuesday","4.Wednesday","5.Thursday","6.Friday","7.Saturday"};
		do
		{
			System.out.print("Enter your choice :");
			userChoice=input.nextInt();
			if (userChoice==1)
			{
			 for(int i=0;i<month.length;i++)
			 {
				 System.out.println(month[i]);
			 }
			}
			else if(userChoice==2)
			{
				 for(int i=0;i<days.length;i++)
				 {
					 System.out.println(days[i]);
				 }
			}
			else
			{
				break;
			}
		}while(userChoice!=3);
		input.close();
	}
}

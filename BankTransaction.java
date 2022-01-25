/*
 * Program for transact the amount from source account to Target account.
 * @author Prabu M
 * @since Jul 1 2021
 * 
 */ 
package javatraining;
import java.util.Scanner;
public class BankTransaction {
	public static void main(String[] args)
	{
		String sourceAccountNumber,targetAccountNumber;
		long amountTransfer;
		//int sourceAccountBalance=6000,targetAccountBalance=3000;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the source account number : ");
		sourceAccountNumber=input.nextLine();
		if(sourceAccountNumber.length()>=8 && sourceAccountNumber.length()<=19)
		{
			System.out.println("Enter the target account number : ");
			targetAccountNumber=input.nextLine();
			if (targetAccountNumber.length()>=8 && targetAccountNumber.length()<=19)
			{
				System.out.println("Entered the amount to transfer: ");
				amountTransfer=input.nextLong();
				if(amountTransfer!=0)
				{
					int sourceAccountBalance=6000;
					//int tarAccountBalance=3000;
					if (amountTransfer<sourceAccountBalance)
					{
						sourceAccountBalance-=amountTransfer;
					//	tarAccountBalance+=amountTransfer;	
					}
					else if (amountTransfer==sourceAccountBalance)
					{
						System.out.println("Your transfering your total amount in bank!!! Are you sure Yes/No");
						char userWish=input.next().charAt(0);
						if (userWish=='y'||userWish=='Y')
						{
							sourceAccountBalance-=amountTransfer;
						//	tarAccountBalance+=amountTransfer;	
						}
						else
						{
							System.out.println("Thank you for visiting us");
						}
					}
					else
					{
						System.out.println("Sorry you dont have that much balance!!");
					}
					System.out.println("An amount of "+amountTransfer+" is transfered from " +sourceAccountNumber+" to "+targetAccountNumber);
				}
				else
				{
					System.out.println("Sorry you entered a invalid amount");
				}
			}
			else
			{
				System.out.println("You enterd a invalid target account number");
			}
		}
		else
		{
			System.out.println("You enterd a invalid Source account number");
		}
		input.close();
	}
}

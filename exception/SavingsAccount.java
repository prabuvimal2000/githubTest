package exception;
import java.util.Scanner;
class InvalidAmountException extends Exception
{
	InvalidAmountException(String s)
	{
		super(s);
		System.out.println();
	}
}
class InsufficientFundException extends Exception
{
	InsufficientFundException(String s)
	{
		super(s);
	}
}
public class SavingsAccount {
	private String accountNumber,name;
	final private double minBalance=500; 
	private static double balance;
    SavingsAccount(String accountNumber,String name)
    {
    	balance= minBalance;
    	if(accountNumber.length()>=9 && accountNumber.length()<=18)
    	{
    	  this.accountNumber=accountNumber;
    	}
    	else
    	{
    		System.out.print("Sorry your enterd account number invalid");
    		System.exit(0);
    	}
    	this.name = name;
    }
    public void deposit(double amount) 
    {
    	if(amount>0)
    	{
    	 balance+=amount;
    	}
    	else
    	{
    		try 
    		{
    		  throw new InvalidAmountException("Your deposite invalid amount");
    		}
    		catch(InvalidAmountException exception)
    		{
    			System.out.println(exception.getMessage());
    		}
    	}
    }
    public void withDraw(double amount)
    {
    	if(minBalance<balance-amount)
    	{
    	 balance-=amount;
    	}
    	else
    	{
    		try 
    		{
    			throw new InsufficientFundException("Sorry You dont have insufficent balance to withdraw\nBeacuse you need to maintain minimum balance as Rs.500");
    		}
    		catch(InsufficientFundException exception)
    		{
    			System.out.println(exception.getMessage());
    		}
    	}
    }
    public void viewBalance()
    {
    	System.out.println("Your Current Balance : Rs."+balance);
    }
    public static void main(String[] args)
    {
    	Scanner input = new Scanner (System.in);
    	String account_No,account_Holder;
    	int userChoice;
    	System.out.println("Enter the account number without Space :");
    	account_No= input.next();
    	System.out.println("Enter the account holder name : ");
    	account_Holder=input.next();
    	SavingsAccount account = new SavingsAccount(account_No,account_Holder);
    	do {
			System.out.println("Please choose the choice in number\n1.Deposit\n2.Withdraw\n3.Check Balance");
			userChoice=input.nextInt();
			int amount;
			switch(userChoice) 
			{
			case 1:
				System.out.println("Enter amount to deposit : ");
				amount=input.nextInt();
				account.deposit(amount); 
				break;
			case 2:
				System.out.println("Enter amount to withdraw");
				amount=input.nextInt();
				account.withDraw(amount);
				break;
			case 3:
				account.viewBalance();
				break;
			}
			if(account.balance>account.minBalance)
			{
				account.viewBalance();
			}
		System.out.println("Do you want to go to the main menu please choose Yes/No");	
		userChoice=input.next().charAt(0);
		}while(userChoice=='Y'||userChoice=='y');
    	input.close();
    }
}

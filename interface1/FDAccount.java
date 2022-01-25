package interface1;

public class FDAccount implements Account
{
	private double amount,interestRate;
	private int noOfDays;
	private int ageOfAcHolder;
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	public double getAmount() 
	{
			return amount;
    }
	public void setInterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}
	public double getInterestRate() 
	{
			return interestRate;
    }
	public void setNoOfDays(int noOfDays) 
	{
		this.noOfDays = noOfDays;
	}
	public int getNoOfDays() 
	{
			return noOfDays;
    }
	public void setAgeOfAcHolder(int ageOfAcHolder) 
	{
		this.ageOfAcHolder = ageOfAcHolder;
	}
	public int getAgeOfAcHolder() 
	{
		return ageOfAcHolder;
	}
	public double calculateInterest()
    {
    	double interestAmount=(amount*noOfDays*interestRate)/36500;
    	return interestAmount;
    }
}

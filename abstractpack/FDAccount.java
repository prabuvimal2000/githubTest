package abstractpack;

public class FDAccount extends Account{
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
	public void setinterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}
	public double getinterestRate() 
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

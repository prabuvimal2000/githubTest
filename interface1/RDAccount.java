package interface1;

public class RDAccount implements Account
{
	private double amount,interestRate;
	private int noOfMonths;
	private double monthlyAmount;
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
	public void setMonthlyAmount(double monthlyAmount)
	{
		this.monthlyAmount = monthlyAmount;
	}
	public double getMonthlyAmount() 
	{
		return monthlyAmount;
	}
	public void setNoOfMonths(int noOfMonths) 
	{
		this.noOfMonths = noOfMonths;
	}
	public int getNoOfMonths() 
	{
			return noOfMonths;
    }
	public double calculateInterest()
    {
    	double interestAmount=(amount*noOfMonths*interestRate)/1200;
    	return interestAmount;
    }
}

package interface1;

public class SBAccount implements Account
{
	private double amount,interestRate;
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
	public double calculateInterest()
    {
    	double interestAmount=(amount*interestRate)/100;
    	return interestAmount;
    }
}

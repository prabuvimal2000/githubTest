package abstractpack;

public class SBAccount extends Account
{
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
	public double calculateInterest()
    {
    	double interestAmount=(amount*interestRate)/100;
    	return interestAmount;
    }
}

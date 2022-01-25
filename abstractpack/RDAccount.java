package abstractpack;

public class RDAccount extends Account
{
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
	public void setinterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}
	
	public double getMonthlyAmount() {
		return monthlyAmount;
	}
	public void setMonthlyAmount(double monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}
	public void setNoOfMonths(int noOfMonths) {
		this.noOfMonths = noOfMonths;
	}
	public double getinterestRate() 
	{
			return interestRate;
    }
	public void setNoOfDays(int noOfMonths) 
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

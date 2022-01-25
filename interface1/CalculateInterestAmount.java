package interface1;

public class CalculateInterestAmount 
{
   public static void main(String[] args)
   {
	    FDAccount fda=new FDAccount();
		SBAccount sba=new SBAccount();
		RDAccount rda=new RDAccount();
		fda.setAmount(30000);
		fda.setAgeOfAcHolder(30);
		fda.setInterestRate(15.25);
		fda.setNoOfDays(200);
		rda.setAmount(9000);
		rda.setMonthlyAmount(5000);
		rda.setInterestRate(5.25);
		rda.setNoOfMonths(10);
		sba.setAmount(10000);
		sba.setInterestRate(10.20);
		System.out.printf("FDAccount type interest amount is : %.4f",fda.calculateInterest());
		System.out.printf("\nSBAccount type interest amount is : %.4f",sba.calculateInterest());
		System.out.printf("\nRDAccount type interest amount is : %.4f",rda.calculateInterest());
	   
   }
}

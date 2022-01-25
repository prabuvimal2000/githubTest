package datatime;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
public class ePayApplicationFroCustomer 
{
	public static void main(String[] args)
	{
		String name,dateofBirth,officeJoinedDate,weddingDate,licJoinedDate,mobileRechargedDate,ebBillDate;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the customer name : ");
	    name=input.next();
	    System.out.println("Please enter the date of birth in given format\n Year-Month-Date");
	    dateofBirth=input.next();
	    System.out.println("Please enter the date of joined in  office by given format\n Year-Month-Date");
	    officeJoinedDate=input.next();
	    System.out.println("Please enter your wedding date in given format\n Year-Month-Date");
	    weddingDate=input.next();
	    System.out.println("Please enter your Lic premium started date in given format\n Year-Month-Date");
	    licJoinedDate=input.next();
	    System.out.println("Please enter your last mobile recharged date in given format\n Year-Month-Date");
	    mobileRechargedDate=input.next();
	    System.out.println("Please enter your last ebbill takened date in given format\n Year-Month-Date");
	    ebBillDate=input.next();
	    LocalDate userDateofBirth,userOfficeJoined,userWeddingDate,now,alertLicDate,alertMobileDate,alertEbBillDate,userLicDate,userMobileRechDate,userEbbillDate;
	    userDateofBirth= LocalDate.parse(dateofBirth);
	    userOfficeJoined=LocalDate.parse(officeJoinedDate);
	    userWeddingDate= LocalDate.parse(weddingDate);
	    userLicDate=LocalDate.parse(licJoinedDate);
	    userMobileRechDate=LocalDate.parse(mobileRechargedDate);
	    userEbbillDate=LocalDate.parse(ebBillDate);
	    now= LocalDate.now();
	    alertLicDate=userLicDate.plusMonths(3);
	    alertMobileDate=userMobileRechDate.plusDays(28);
	    alertEbBillDate=userEbbillDate.plusMonths(2);
	    System.out.println("Mr."+name+" Your Lic premium time is every 3 months from : "+userLicDate);
	    System.out.println("Mr."+name+" You need to recharge after 28 dates from : "+userMobileRechDate);
	    System.out.println("Mr."+name+" You need to pay the ebbill after 2 months from : "+ userEbbillDate);
	    if(now==alertLicDate.minusDays(7));
	    {
	    	System.out.println("Mr."+name+" Your Lic premium paytime only 7 days left from  "+alertLicDate);
	    	if(now==alertMobileDate.minusDays(7))
	    	{
	    		System.out.println("Mr."+name+" Your Mobile reacherge ends at "+alertMobileDate);
	    	}
	    	else if (now==alertEbBillDate.minusDays(7))
	    	{
	    		System.out.println("Mr."+name+" Your Eb bill last date to pay amount is "+alertEbBillDate);
	    	}
	    	else if(now==alertMobileDate.minusDays(7)&&now==alertEbBillDate.minusDays(7))
	    	{
	    		System.out.println("Mr."+name+" Your Mobile reacherge ends at "+alertMobileDate);
	    		System.out.println("Mr."+name+" Your Eb bill last date to pay amount is "+alertEbBillDate);
	    	}
	    }
	    if (now==alertEbBillDate.minusDays(7) && alertMobileDate!=alertLicDate) 
	    {
	    	System.out.println("Mr."+name+" Your Eb bill last date to pay amount is "+alertEbBillDate);
	    	if(now==alertMobileDate.minusDays(7))
	    	{
	    		System.out.println("Mr."+name+" Your Mobile reacherge ends at "+alertMobileDate);
	    	}
	    }
	    else if (now==alertMobileDate.minusDays(7))
	    {
	    	System.out.println("Mr."+name+" Your Mobile reacherge ends at "+alertMobileDate);
	    }
	    if( userDateofBirth.getYear()!=now.getYear() && userWeddingDate.getYear()!=now.getYear() && userOfficeJoined.getYear()!=now.getYear())
	    {
	    if(userDateofBirth.getDayOfMonth()==now.getDayOfMonth() && userDateofBirth.getMonthValue()==now.getMonthValue())
	    {
	    	System.out.println("Happy birthday MR."+name);
	    	if(userOfficeJoined.getDayOfMonth()==now.getDayOfMonth() && userOfficeJoined.getMonthValue()==now.getMonthValue())
	    	{
	    		System.out.println("Congradualtions for completed "+(Year.of(now.getYear())).compareTo(Year.of(userOfficeJoined.getYear()))+ " year at our company Mr."+name);
	    		if (userWeddingDate.getDayOfMonth()==now.getDayOfMonth() && userWeddingDate.getMonthValue()==now.getMonthValue())
		    	{
		    		System.out.println("Happy "+ (Year.of(now.getYear())).compareTo(Year.of(userWeddingDate.getYear()))+" Wedding anniversary MR."+name);
		    	}
	    	}
	    	else if (userWeddingDate.getDayOfMonth()==now.getDayOfMonth() && userWeddingDate.getMonthValue()==now.getMonthValue())
	    	{
	    		System.out.println("Happy "+ (Year.of(now.getYear())).compareTo(Year.of(userWeddingDate.getYear()))+" Wedding anniversary MR."+name);
	    	}
	 
	    }
	    else if (userOfficeJoined.getDayOfMonth()==now.getDayOfMonth() && userOfficeJoined.getMonthValue()==now.getMonthValue())
	    {
	    	
	    	System.out.println("Congradualtions for completed "+(Year.of(userOfficeJoined.getYear())).compareTo(Year.of(now.getYear()))+ " year at our company Mr."+name);
	    	if (userWeddingDate.getDayOfMonth()==now.getDayOfMonth() && userWeddingDate.getMonthValue()==now.getMonthValue())
	    	{
	    		System.out.println("Happy "+ (Year.of(now.getYear())).compareTo(Year.of(userWeddingDate.getYear()))+" Wedding anniversary MR."+name);
	    	}
	    }
	    else if (userWeddingDate.getDayOfMonth()==now.getDayOfMonth() && userWeddingDate.getMonthValue()==now.getMonthValue())
	    {
	    	System.out.println("Happy Wedding anniversary MR."+name);
	    }
	    else
	    {
	    	System.out.println("You enterd Invalid data");
	    }
	    }
	    else
	    {
	    	System.out.println("Plese check you enterd correct data or you have not completd 1 year");
	    }
		input.close();
	}
}
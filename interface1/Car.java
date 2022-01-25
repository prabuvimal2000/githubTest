package interface1;

public class Car implements Servicing
{
	private int months;
	private String serviceTime ;
	private int[] kiloMeterRange= {2500,5000,10000,15000,20000,35000};
	private String[] servicePeriod= {"First","Second","Third","Fourth","Fifth"};
	private int[] month= {3,6,9,12,15};
	public void setMonths(int months) 
	{
		this.months = months;
	}
	public int getMonths() 
	{
		return months;
	}
	
	public String getServiceTime()
	{
		for(int i=0;i<month.length;i++)
		{
		  if(months==month[i])
		 {
			serviceTime=servicePeriod[i];
			break;
		 }
		}
		return serviceTime;
	}
	public void displayHistory()
	{
		System.out.println("Your Car service details : ");
		for (int i=0,j=months,k=0;i<servicePeriod.length||k<kiloMeterRange.length;i++,j=j-3,k++)
		{
			if(j>0)
			{
			System.out.println("You completed your "+servicePeriod[i]+" service at before "+j+" months in between km range of "+ kiloMeterRange[k]+"-"+ kiloMeterRange[k+1]);
			}
		}
	}
}

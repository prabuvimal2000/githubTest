/*
 * Program for print the employee details using inheritance concept.
 * @author Prabu M
 * @since Jul 6 2021
 * 
 */
package inheritance;
public class Employee {
	protected String name,address,phoneNum;
    protected float salary;
    public void setEmpData(String name,String address,String phoneNum,float salary)
    {
    	this.name=name;
    	this.address=address;
    	this.phoneNum=phoneNum;
    	this.salary=salary;
    }
    public void printSalary()
    {
    	System.out.println("Employee details are :\nEmployee name : "+name+"\naddress: "+address+"\nPhone Number "+phoneNum+"\nSalary : "+salary);
    }
}
class Permanent extends Employee
{
	private int experience,period;
	private String serviceRecord,allowances;
	public void setPermanentData(int experience,String serviceRecord,int period,String allowances)
	{
		this.experience=experience;
		this.serviceRecord=serviceRecord;
		this.allowances=allowances;
		this.period=period;
	}
	public  void printSalary() 
	{
		super.printSalary();
		System.out.println("Experience : "+experience+"\nService Record : "+serviceRecord+"\nPeriod : "+period+"\nAllowances : "+allowances);
	}
}
class Contract extends Employee
{
	private int experience,period;
	private String serviceRecord,allowances;
	public void setContractData(int experience,String serviceRecord,int period,String allowances)
	{
		this.experience=experience;
		this.serviceRecord=serviceRecord;
		this.allowances=allowances;
		this.period=period;
	}
	public void printSalary() 
	{
		super.printSalary();
		System.out.println("Experience : "+experience+"\nService Record : "+serviceRecord+"\nPeriod : "+period+"\nAllowances : "+allowances);
	}
	
}

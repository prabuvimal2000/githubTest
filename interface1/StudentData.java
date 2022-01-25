package interface1;

public class StudentData implements HostalData 
{
	private String collegeName,collegeAddress,stuAddress,hostalName,hostalAddress;
	private int collegeCode;
	public void setCollegeName(String collegeName) 
	{
		this.collegeName = collegeName;
	}
	public String getCollegeName() 
	{
		return collegeName;
	}
	public void setCollegeCode(int collegeCode) 
	{
		this.collegeCode = collegeCode;
	}
	public int getCollegeCode()
	{
		return collegeCode;
	}
	public void setCollegeAddress(String collegeAddress) 
	{
		this.collegeAddress = collegeAddress;
	}
	public String getCollegeAddress()
	{
		return collegeAddress;
	}
	public void setStuAddress(String stuAddress) 
	{
		this.stuAddress = stuAddress;
	}
	public String getStuAddress() 
	{
		return stuAddress;
	}
	
	public void setHostalName(String hostalName) 
	{
		this.hostalName = hostalName;
	}
	public String getHostalName() 
	{
		return hostalName;
	}
	public void setHostalAddress(String hostalAddress) 
	{
		this.hostalAddress = hostalAddress;
	}
	public String getHostalAddress() {
		return hostalAddress;
	}
	public void collegeDetails()
	{
		System.out.println("College Name : " +collegeName);
		System.out.println("College Code : " + collegeCode);
		System.out.println("College Address : "+collegeAddress);
	}
    public void studentData(String studentName)
    {
    	System.out.println("Student Name : "+studentName);
		System.out.println("Student Address : "+stuAddress);
    }
	public void hostalDetail()
	{
		  System.out.println("Hostal Name : "+hostalName);
		  System.out.println("Hostal Address : "+hostalAddress);
	}
}

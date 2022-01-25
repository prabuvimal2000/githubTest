package inheritance;

public class Students extends Course{
	private String studentName,address;
	private int regNumber;
	public void setStudentDetails(String studentName,String address,int regNumber)
	{
		this.studentName=studentName;
		this.address=address;
		this.regNumber=regNumber;
	}
	public void studentDetails()
	{
		displayDetails();
		System.out.println("Student personal Details are :\nStudent Name: "+studentName+"\naddress :"+address+"\nReg.No "+regNumber);
	}
	 public static void main(String[] args)
	    {
	    	Students obj = new Students();
	    	obj.setData("Akshaya college of Engineering & Technology","7,kinathukadavu,Coimbatore-641004",7203);
	    	obj.setCourse("Java",100,320);
	    	obj.setStudentDetails("Sachin","ramsamy layout,coimbatore",34425);
	    	obj.studentDetails();
	    }
}

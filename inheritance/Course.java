package inheritance;

public class Course extends College {
	protected String courseName;
	protected int courseCode, batchSize;
    public void setCourse(String name,int batchSize,int code)
    {
    	this.courseName=name;
    	this.batchSize=batchSize;
    	this.courseCode=code;
    }
    public void displayDetails()
    {
    	display();
    	System.out.println("Course details:\nCouse name : "+courseName+"\nBatch Size: "+batchSize+"\nCourse code : "+courseCode);
    }
}

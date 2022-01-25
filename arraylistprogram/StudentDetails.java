package arraylistprogram;
public class StudentDetails 
{
  private String name;
  private int rollNumber,mark1,mark2,mark3,totalMark,maxSubject;
  private float percentage;  
  StudentDetails()
  {
	  totalMark=0;
	  maxSubject=3;
	  percentage=0.0f;
  }
   StudentDetails(String name, int rollNumber, int mark1, int mark2, int mark3) 
   {
	this.name = name;
	this.rollNumber = rollNumber;
	this.mark1 = mark1;
	this.mark2 = mark2;
	this.mark3 = mark3;
  }
public int getTotalMark() 
  {
	totalMark=mark1+mark2+mark3;
	return totalMark;
  }
  public float getPercentage()
  {
	percentage=totalMark/maxSubject;
	return percentage;
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollNumber() {
	return rollNumber;
}
public void setRollNumber(int rollNumber) {
	this.rollNumber = rollNumber;
}
public int getMark1() {
	return mark1;
}
public void setMark1(int mark1) {
	this.mark1 = mark1;
}
public int getMark2() {
	return mark2;
}
public void setMark2(int mark2) {
	this.mark2 = mark2;
}
public int getMark3() {
	return mark3;
}
public void setMark3(int mark3) {
	this.mark3 = mark3;
}
}

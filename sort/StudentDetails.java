package sort;

public class StudentDetails implements Comparable<StudentDetails>
{
  private int stuId;
  private String stuName;
  public int compareTo(StudentDetails s1)
  {
	  if(this.stuId>s1.stuId)
	  {
		  return 1;
	  }
	  else if (this.stuId<s1.stuId)
	  {
		  return -1;
	  }
	  else
	  {
		  return 0;
	  }
  }
  StudentDetails(int stuId,String stuName)
  {
	  super();
	  this.stuId=stuId;
	  this.stuName=stuName;
  }
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String toString()
    {
        return stuId + " " + stuName;
    }
}

package sort;
import java.time.LocalDate;
public class EmployeeDetails implements Comparable<EmployeeDetails>
{
 private String empName;
 private double salary;
 private LocalDate joinedDate;
 //DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("yyyy/MM/dd"); 
 public int compareTo(EmployeeDetails emp)
 {
	 if(this.salary>emp.salary)
	 {
		 return 1;
	 }
	 else if(this.salary<emp.salary)
	 {
		 return -1;
	 }
	 else
	 {
		 return 0;
	 }
 }
 EmployeeDetails(String empName,double salary,String date)
 {
	 this.empName=empName;
	 this.salary=salary;
	 joinedDate=LocalDate.parse(date);
 }
public String getEmpName() 
{
	return empName;
}
public void setEmpName(String empName) 
{
	this.empName = empName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary)
{
	this.salary = salary;
}
public LocalDate getJoinedDate() 
{
	return joinedDate;
}
public void setJoinedDate(LocalDate joinedDate)
{
	this.joinedDate = joinedDate;
}
public String toString()
{
    return empName + "\t\t" + salary+ "\t\t"+ joinedDate;
}
}
